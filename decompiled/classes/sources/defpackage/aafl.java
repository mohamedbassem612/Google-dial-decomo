package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafl {
    public defpackage.aafm a;
    public defpackage.aafm b;
    public defpackage.aafe c;
    public com.google.android.gms.common.Feature[] d;
    public int f;
    private final java.lang.Runnable g = new defpackage.aafk(0);
    public boolean e = true;

    public final defpackage.aogc a() {
        if (this.a == null) {
            throw new java.lang.IllegalArgumentException("Must set register function");
        }
        if (this.b == null) {
            throw new java.lang.IllegalArgumentException("Must set unregister function");
        }
        defpackage.aafe aafeVar = this.c;
        if (aafeVar == null) {
            throw new java.lang.IllegalArgumentException("Must set holder");
        }
        if (aafeVar.a != null) {
            return new defpackage.aogc(new defpackage.aafj(this, this.c, this.d, this.e, this.f), new defpackage.apnt(this), this.g, (boolean[]) null);
        }
        throw new java.lang.NullPointerException("Key must not be null");
    }
}
