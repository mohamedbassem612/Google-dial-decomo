package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ctt {
    private defpackage.aonj a;

    public defpackage.aonj a() {
        return this.a;
    }

    public abstract void b(defpackage.csj csjVar);

    public void e(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    public final void f() {
        defpackage.aonj aonjVarA = a();
        if (aonjVarA != null) {
            aonjVarA.a(this);
        }
    }
}
