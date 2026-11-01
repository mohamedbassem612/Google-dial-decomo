package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vua {
    public boolean a;
    public byte b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    private int i;

    public vua(mij mijVar) {
        this.c = j$.util.Optional.empty();
        this.f = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.c = mijVar.a;
        this.f = mijVar.b;
        this.d = mijVar.c;
        this.e = mijVar.d;
        this.h = mijVar.e;
        this.g = mijVar.f;
        this.i = mijVar.g;
        this.a = mijVar.h;
        this.b = (byte) 3;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final defpackage.vub a() {
        ?? r1;
        ?? r2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        if (this.b == 3 && (r1 = this.c) != 0 && (r2 = this.d) != 0 && (obj = this.e) != null && (obj2 = this.f) != null && (obj3 = this.g) != null && (obj4 = this.h) != null) {
            return new defpackage.vub(r1, r2, this.i, (defpackage.vtz) obj, (defpackage.vtz) obj2, (android.telecom.PhoneAccountHandle) obj3, (java.lang.String) obj4, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" title");
        }
        if (this.d == null) {
            sb.append(" description");
        }
        if ((this.b & 1) == 0) {
            sb.append(" imageResourceId");
        }
        if (this.e == null) {
            sb.append(" primaryAction");
        }
        if (this.f == null) {
            sb.append(" secondaryAction");
        }
        if (this.g == null) {
            sb.append(" phoneAccountHandle");
        }
        if (this.h == null) {
            sb.append(" sourceType");
        }
        if ((this.b & 2) == 0) {
            sb.append(" isPinSet");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.i = 2131232254;
        this.b = (byte) (this.b | 1);
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 2);
    }

    public final void d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            throw new java.lang.NullPointerException("Null phoneAccountHandle");
        }
        this.g = phoneAccountHandle;
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sourceType");
        }
        this.h = str;
    }

    public final void f(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("Null title");
        }
        this.c = charSequence;
    }

    public final mij g() {
        if (this.b != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" slot");
            }
            if ((this.b & 2) == 0) {
                sb.append(" isPrimarySim");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.d;
        java.lang.Object obj4 = this.e;
        java.lang.Object obj5 = this.h;
        return new mij((j$.util.Optional) obj, (j$.util.Optional) obj2, (j$.util.Optional) obj3, (j$.util.Optional) obj4, (j$.util.Optional) obj5, (j$.util.Optional) this.g, this.i, this.a);
    }

    public final void h(int i) {
        this.i = i;
        this.b = (byte) (this.b | 1);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final mao i() {
        java.lang.Object obj;
        if (this.b != 3 || (obj = this.h) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.h == null) {
                sb.append(" label");
            }
            if ((this.b & 1) == 0) {
                sb.append(" drawableResId");
            }
            if ((this.b & 2) == 0) {
                sb.append(" isEnabled");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        java.lang.Object obj2 = this.e;
        return new mao((java.lang.String) obj, (j$.util.Optional) obj2, this.i, this.a, (android.view.View.OnClickListener) this.c, (j$.util.Optional) this.f, (j$.util.Optional) this.g, (j$.util.Optional) this.d);
    }

    public final void j(java.lang.String str) {
        this.e = j$.util.Optional.of(str);
    }

    public final void k(int i) {
        this.i = i;
        this.b = (byte) (this.b | 1);
    }

    public final void l(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 2);
    }

    public final void m(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null label");
        }
        this.h = str;
    }

    public vua(byte[] bArr) {
        this.c = j$.util.Optional.empty();
        this.f = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
    }

    public vua(byte[] bArr, byte[] bArr2) {
        this.e = j$.util.Optional.empty();
        this.f = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
    }
}
