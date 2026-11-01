package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcd {
    public boolean a;
    public java.lang.Integer b;
    private defpackage.amft c;
    private j$.util.Optional d;
    private j$.util.Optional e;
    private boolean f;
    private aify g;
    private byte h;

    public amcd(defpackage.amce amceVar) {
        this();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
        this.c = amceVar.b;
        this.b = amceVar.c;
        this.d = amceVar.d;
        this.e = amceVar.e;
        this.f = amceVar.f;
        this.g = amceVar.g;
        this.h = (byte) 1;
    }

    public final defpackage.amce a() {
        if (!this.a) {
            return b();
        }
        defpackage.amft amftVar = this.c;
        if (amftVar == null) {
            throw new java.lang.IllegalStateException("Property \"amItem\" has not been set");
        }
        this.b = java.lang.Integer.valueOf(defpackage.amce.f(amftVar).length());
        return b();
    }

    public final defpackage.amce b() {
        defpackage.amft amftVar;
        java.lang.Integer num;
        aify aifyVar;
        if (this.h == 1 && (amftVar = this.c) != null && (num = this.b) != null && (aifyVar = this.g) != null) {
            return new defpackage.amce(amftVar, num, this.d, this.e, this.f, aifyVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" amItem");
        }
        if (this.b == null) {
            sb.append(" finalizedTextLength");
        }
        if (this.h == 0) {
            sb.append(" wasBeforeLastSkip");
        }
        if (this.g == null) {
            sb.append(" wordCosts");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(defpackage.amft amftVar) {
        if (amftVar == null) {
            throw new java.lang.NullPointerException("Null amItem");
        }
        this.c = amftVar;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null cacheSegmentId");
        }
        this.d = optional;
    }

    public final void e(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null rematchedNextSegmentId");
        }
        this.e = optional;
    }

    public final void f(boolean z) {
        this.f = z;
        this.h = (byte) 1;
    }

    public final void g(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null wordCosts");
        }
        this.g = aifyVar;
    }

    public amcd(byte[] bArr) {
        this();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
    }

    public amcd() {
        this.a = false;
    }
}
