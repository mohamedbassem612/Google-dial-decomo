package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adjt extends defpackage.adkd {
    private final defpackage.adhw a;
    private final long b;
    private final int c;
    private final int d;
    private final com.google.android.libraries.micore.superpacks.base.BasePriority e;
    private volatile transient int f;
    private volatile transient boolean g;
    private volatile transient java.lang.String h;

    public adjt(defpackage.adhw adhwVar, long j, int i, int i2, com.google.android.libraries.micore.superpacks.base.BasePriority basePriority) {
        this.a = adhwVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = basePriority;
    }

    @Override // defpackage.adkd
    public final int a() {
        return this.c;
    }

    @Override // defpackage.adkd
    public final int b() {
        return this.d;
    }

    @Override // defpackage.adkd
    public final long c() {
        return this.b;
    }

    @Override // defpackage.adkd
    public final com.google.android.libraries.micore.superpacks.base.BasePriority d() {
        return this.e;
    }

    @Override // defpackage.adkd
    public final defpackage.adhw e() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adkd) {
            defpackage.adkd adkdVar = (defpackage.adkd) obj;
            if (this.a.equals(adkdVar.e()) && this.b == adkdVar.c() && this.c == adkdVar.a() && this.d == adkdVar.b() && this.e.equals(adkdVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adkd
    public final int f() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    this.f = this.e.c(this.c);
                    this.g = true;
                }
            }
        }
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.adkd
    public final java.lang.String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = "{" + this.a.toString() + ": " + this.b + " bytes}";
                    if (this.h == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
