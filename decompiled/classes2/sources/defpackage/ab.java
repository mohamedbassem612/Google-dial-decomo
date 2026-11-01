package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ab {
    public final cj a;

    public ab(cj cjVar) {
        aooh.f(cjVar, "operation");
        this.a = cjVar;
    }

    public final boolean b() {
        cj cjVar = this.a;
        android.view.View view = cjVar.a.Q;
        int iBT = view != null ? den.bT(view) : 0;
        int i = cjVar.h;
        return iBT == i || !(iBT == 2 || i == 2);
    }
}
