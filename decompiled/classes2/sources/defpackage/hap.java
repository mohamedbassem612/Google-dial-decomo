package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hap implements defpackage.haq, defpackage.han {
    private final android.graphics.Path a = new android.graphics.Path();
    private final android.graphics.Path b = new android.graphics.Path();
    private final android.graphics.Path c = new android.graphics.Path();
    private final java.util.List d = new java.util.ArrayList();
    private final defpackage.hdt e;

    public hap(defpackage.hdt hdtVar) {
        this.e = hdtVar;
    }

    private final void a(android.graphics.Path.Op op) {
        android.graphics.Path path = this.b;
        path.reset();
        android.graphics.Path path2 = this.a;
        path2.reset();
        java.util.List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            defpackage.haq haqVar = (defpackage.haq) list.get(size);
            if (haqVar instanceof defpackage.hah) {
                defpackage.hah hahVar = (defpackage.hah) haqVar;
                java.util.List listJ = hahVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        android.graphics.Path pathI = ((defpackage.haq) listJ.get(size2)).i();
                        pathI.transform(hahVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(haqVar.i());
            }
        }
        defpackage.haq haqVar2 = (defpackage.haq) list.get(0);
        if (haqVar2 instanceof defpackage.hah) {
            defpackage.hah hahVar2 = (defpackage.hah) haqVar2;
            java.util.List listJ2 = hahVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                android.graphics.Path pathI2 = ((defpackage.haq) listJ2.get(i)).i();
                pathI2.transform(hahVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(haqVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        int i = 0;
        while (true) {
            java.util.List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((defpackage.haq) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        throw null;
    }

    @Override // defpackage.han
    public final void h(java.util.ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            defpackage.hag hagVar = (defpackage.hag) listIterator.previous();
            if (hagVar instanceof defpackage.haq) {
                this.d.add((defpackage.haq) hagVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        android.graphics.Path path = this.c;
        path.reset();
        defpackage.hdt hdtVar = this.e;
        if (!hdtVar.a) {
            int i = hdtVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    java.util.List list = this.d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((defpackage.haq) list.get(i3)).i());
                    i3++;
                }
            } else if (i2 == 1) {
                a(android.graphics.Path.Op.UNION);
            } else if (i2 == 2) {
                a(android.graphics.Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                a(android.graphics.Path.Op.INTERSECT);
            } else if (i2 == 4) {
                a(android.graphics.Path.Op.XOR);
            }
        }
        return path;
    }
}
