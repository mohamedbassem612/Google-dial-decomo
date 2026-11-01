package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elt extends aojo {
    public final java.util.List a;
    public final java.util.List b;
    public final defpackage.akf c;

    public elt(defpackage.akf akfVar, java.util.List list, java.util.List list2, defpackage.acf acfVar) {
        if (acfVar.b != list2.size() + 1) {
            throw new java.lang.IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (acfVar.b == 0) {
            un.d("FloatList is empty.");
        }
        int i = 0;
        float fA = 0.0f;
        if (acfVar.a[0] != 0.0f) {
            throw new java.lang.IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (acfVar.b() != 1.0f) {
            throw new java.lang.IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.c = akfVar;
        this.b = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list2.size();
        while (i < size) {
            int i2 = i + 1;
            if (acfVar.a(i2) - acfVar.a(i) > 1.0E-4f) {
                arrayList.add(new defpackage.els(this, (defpackage.ell) list2.get(i), fA, acfVar.a(i2)));
                fA = acfVar.a(i2);
            }
            i = i2;
        }
        defpackage.els elsVar = (defpackage.els) arrayList.get(ajsz.aZ(arrayList));
        if (elsVar.b > 1.0f) {
            throw new java.lang.IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        elsVar.c = 1.0f;
        this.a = arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.els) {
            return super.contains((defpackage.els) obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return (defpackage.els) this.a.get(i);
    }

    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.els) {
            return super.indexOf((defpackage.els) obj);
        }
        return -1;
    }

    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.els) {
            return super.lastIndexOf((defpackage.els) obj);
        }
        return -1;
    }
}
