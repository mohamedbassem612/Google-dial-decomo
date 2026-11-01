package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class dtj implements dti {
    public final dtr d;
    public int e;
    public int f;
    public dti a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    defpackage.dtk h = null;
    public boolean i = false;
    public final java.util.List j = new java.util.ArrayList();
    public final java.util.List k = new java.util.ArrayList();

    public dtj(dtr dtrVar) {
        this.d = dtrVar;
    }

    public final void a(dti dtiVar) {
        this.j.add(dtiVar);
        if (this.i) {
            dtiVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dti) it.next()).f();
        }
    }

    public final void f() {
        java.util.List<defpackage.dtj> list = this.k;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((defpackage.dtj) it.next()).i) {
                return;
            }
        }
        this.c = true;
        dti dtiVar = this.a;
        if (dtiVar != null) {
            dtiVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        defpackage.dtj dtjVar = null;
        for (defpackage.dtj dtjVar2 : list) {
            if (!(dtjVar2 instanceof defpackage.dtk)) {
                i++;
                dtjVar = dtjVar2;
            }
        }
        if (dtjVar != null && i == 1 && dtjVar.i) {
            defpackage.dtk dtkVar = this.h;
            if (dtkVar != null) {
                if (!dtkVar.i) {
                    return;
                } else {
                    this.e = this.g * dtkVar.f;
                }
            }
            c(dtjVar.f + this.e);
        }
        dti dtiVar2 = this.a;
        if (dtiVar2 != null) {
            dtiVar2.f();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.d.d.ai;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        java.lang.Object objValueOf = this.i ? java.lang.Integer.valueOf(this.f) : "unresolved";
        java.util.List list = this.k;
        java.util.List list2 = this.j;
        return str2 + ':' + str + '(' + objValueOf.toString() + ") <t=" + list.size() + ":d=" + list2.size() + '>';
    }
}
