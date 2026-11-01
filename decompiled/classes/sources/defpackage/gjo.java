package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gjo implements defpackage.gin {
    public final defpackage.gip f;
    public final java.lang.String g;
    public boolean h;

    public gjo(defpackage.gip gipVar, java.lang.String str) {
        this.f = gipVar;
        this.g = str;
    }

    @Override // defpackage.gin
    public /* synthetic */ boolean o() {
        return c(0) != 0;
    }

    protected final void p() {
        if (this.h) {
            fsu.J(21, "statement is closed");
            throw new defpackage.aoiq();
        }
    }

    protected final void q() {
        this.h = true;
    }
}
