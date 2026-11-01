package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghd implements java.lang.AutoCloseable {
    public final java.lang.String a;
    public final defpackage.aonn b;
    public final defpackage.aoir c = new defpackage.aoiy(new defpackage.ghb(this, 0));
    public final defpackage.kaw d;

    public ghd(defpackage.kaw kawVar, java.lang.String str, defpackage.aonn aonnVar) {
        this.d = kawVar;
        this.a = str;
        this.b = aonnVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.aoir aoirVar = this.c;
        if (aoirVar.b()) {
            ((defpackage.gjh) aoirVar.a()).close();
        }
    }
}
