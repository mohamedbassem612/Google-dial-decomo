package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class apjz {
    public final java.lang.String a;
    public final boolean b;
    public defpackage.apkb c;
    public long d;

    public apjz(java.lang.String str, boolean z) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final java.lang.String toString() {
        return this.a;
    }
}
