package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aeph {
    public int a = 1;

    public abstract void g(defpackage.aenj aenjVar);

    public abstract void j(defpackage.aenj aenjVar);

    public final void k(defpackage.aenj aenjVar) {
        if (this.a != 3) {
            this.a = 3;
            g(aenjVar);
        }
    }

    public final void l(defpackage.aenj aenjVar) {
        if (this.a != 2) {
            this.a = 2;
            j(aenjVar);
        }
    }
}
