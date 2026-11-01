package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrn {
    public int a;

    public anrn() {
        this.a = -1;
    }

    public final defpackage.anro a() {
        return new defpackage.anro(this.a);
    }

    public final void b(int i) {
        this.a |= i;
    }

    public final defpackage.aaqm c() {
        if (this.a >= 0) {
            return new defpackage.aaqm(this);
        }
        throw new java.lang.IllegalArgumentException("Must provide valid client application ID!");
    }

    public anrn(int i) {
        this.a = i;
    }
}
