package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgq {
    public final android.content.Context a;
    public final java.util.concurrent.Executor b;
    public java.lang.String c;
    public java.util.Set d;
    public defpackage.apnt f;
    private boolean g = false;
    public defpackage.ahzi e = new defpackage.tzo(10);

    public afgq(android.content.Context context, java.util.concurrent.Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final defpackage.afgs a() {
        boolean z = true;
        if (!this.g && this.d == null) {
            z = false;
        }
        defpackage.ahvr.bN(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new defpackage.afgs(this);
    }

    public final void b() {
        this.d = null;
        this.g = true;
    }

    public final void c(java.lang.String... strArr) {
        defpackage.aihb aihbVar = new defpackage.aihb();
        aihbVar.j(strArr);
        defpackage.aihd aihdVarG = aihbVar.g();
        defpackage.ahvr.bN(aihdVarG.size() == 1, "Duplicate keys specified");
        this.d = aihdVarG;
        this.g = false;
    }

    public final void d() {
        this.c = java.lang.String.valueOf(this.a.getPackageName()).concat("_preferences");
    }

    public final void e(defpackage.afgr afgrVar) {
        this.f = new defpackage.apnt(afgrVar);
    }
}
