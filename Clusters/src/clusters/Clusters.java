package clusters;

import java.util.ArrayList;
import java.util.Objects;

public interface Clusters {
    public cluster intersection(cluster a);
    public cluster difference(cluster a);
    public ArrayList<cluster>subsets();
}

class cluster implements Clusters {

    ArrayList<Integer> list = new ArrayList<>();

    public cluster() {
    }

    public cluster(int[] a) {
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
    }

    public cluster(cluster a) {
    }

    public void add(int a) {
        list.add(a);
    }

    public void print() {
        if (this.list == null) {
            System.out.print("");
        }
        for (int i = 0; i < this.list.size(); i++) {
            if (i == this.list.size() - 1) {
                System.out.print(this.list.get(i));
            } else {
                System.out.print(this.list.get(i) + ",");
            }
        }
    }

    public boolean equivalent(cluster a) {
        return a.list.size() == this.list.size();
    }

    public boolean equal(cluster a) {
        boolean result = true;
        for (int i = 0; i < a.list.size(); i++) {
            if (!Objects.equals(a.list.get(i), this.list.get(i))) {
                return false;
            }
        }
        return result;
    }

    public cluster combination(cluster a) {
        cluster newSet = new cluster();
        newSet.list.addAll(this.list);
        boolean t = true;

        for (int i = 0; i < a.list.size(); i++) {
            for (int j = 0; j < newSet.list.size(); j++) {
                if (Objects.equals(a.list.get(i), newSet.list.get(j))) {
                    t = false;
                }
            }
            if (t) {
                newSet.list.add(a.list.get(i));
            }
            t = true;
        }
        return newSet;
    }

    @Override
    public cluster intersection(cluster a) {
        cluster newSet = new cluster();

        for (int i = 0; i < a.list.size(); i++) {
            for (int j = 0; j < this.list.size(); j++) {
                if (Objects.equals(a.list.get(i), this.list.get(j))) {
                    newSet.list.add(a.list.get(i));
                }
            }
        }
        return newSet;
    }

    @Override
    public cluster difference(cluster a) {
        cluster newSet = new cluster();
        boolean t = true;

        for (int i = 0; i < this.list.size(); i++) {
            for (int j = 0; j < a.list.size(); j++) {
                if (Objects.equals(this.list.get(i), a.list.get(j))) {
                    t = false;
                }
            }
            if (t) {
                newSet.list.add(this.list.get(i));
            }
            t = true;
        }
        return newSet;
    }

    @Override
    public ArrayList<cluster> subsets() {
        //Only works for 3-element sets

        ArrayList<cluster> newList = new ArrayList<>();

        cluster empty = new cluster();
        newList.add(empty);

        for (int i = 0; i < this.list.size(); i++) {
            cluster newSet = new cluster();
            newSet.list.add(this.list.get(i));
            newList.add(newSet);
        }

        for (int j = 0; j < this.list.size(); j++) {
            for (int i = j + 1; i < this.list.size(); i++) {
                cluster newSet = new cluster();
                newSet.list.add(this.list.get(j));
                newSet.list.add(this.list.get(i));
                newList.add(newSet);
            }
        }

        cluster newSet = new cluster();
        newSet.list.addAll(this.list);
        newList.add(newSet);

        return newList;
    }

    public static void main(String[] args) {
        cluster cls = new cluster();

        cls.add(10);
        cls.add(11);
        cls.add(2);

        System.out.print("Cluster = {");
        cls.print();
        System.out.print("}\n");

        int[] a = {1, 2, 3, 4, 5, 6};
        cluster cls2 = new cluster(a);

        System.out.print("Cluster2 = {");
        cls2.print();
        System.out.print("}\n");

        cluster cls3 = new cluster(a);

        System.out.print("Cluster3 = {");
        cls3.print();
        System.out.println("}");

        if (cls.equivalent(cls2)) {
            System.out.println("Cluster and Cluster2 are equivalent.");
        } else {
            System.out.println("Cluster and Cluster2 are not equivalent");
        }

        if (cls2.equal(cls3)) {
            System.out.println("Cluster and Cluster2 are equal.");
        } else {
            System.out.println("Cluster and Cluster2 are not equal.");
        }

        cluster sn = cls.combination(cls2);

        System.out.print("Combination of Cluster and Cluster2 = {");
        sn.print();
        System.out.print("}\n");

        cluster sn2 = cls.intersection(cls2);

        System.out.print("Intersection of Cluster and Cluster2  = {");
        sn2.print();
        System.out.println("}");

        cluster sn3 = cls.difference(cls2);

        System.out.print("Difference of Cluster and Cluster2  = [");
        sn3.print();
        System.out.println("}");

        System.out.println("Subsets of Cluster");
        ArrayList<cluster> result = cls.subsets();

        for (int i = 0; i < result.size(); i++) {
            System.out.print("{");
            result.get(i).print();
            System.out.println("}");
        }
    }

}
