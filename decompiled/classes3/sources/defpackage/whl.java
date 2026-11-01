package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class whl {
    public java.lang.Object a;
    public java.lang.Object b;

    public whl(char[] cArr) {
        this.a = j$.util.Optional.empty();
        this.b = j$.util.Optional.empty();
    }

    public static final void c(android.support.v7.widget.RecyclerView recyclerView, defpackage.whl whlVar) {
        whlVar.b(recyclerView.canScrollVertically(-1));
    }

    public final void a(aw awVar, final android.support.v7.widget.RecyclerView recyclerView) {
        aooh.f(awVar, "fragment");
        aooh.f(recyclerView, "recyclerView");
        awVar.Q().P().c(new emw() { // from class: com.android.dialer.theme.liftonscroll.impl.AppBarLiftOnScrollImpl$listen$1
            @androidx.lifecycle.OnLifecycleEvent(a = emp.ON_RESUME)
            public final void onResume() {
                defpackage.whl.c(recyclerView, this);
            }
        });
        recyclerView.setOnScrollChangeListener(new lyf(recyclerView, this, 2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [enh, java.lang.Object] */
    public final void b(boolean z) {
        java.lang.Object obj = this.b;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        if (aooh.n(obj, boolValueOf)) {
            return;
        }
        this.b = boolValueOf;
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.a(boolValueOf);
        }
    }

    public final defpackage.sub d() {
        return new defpackage.sub((j$.util.Optional) this.a, (j$.util.Optional) this.b);
    }

    public final void e(java.lang.String str) {
        this.b = j$.util.Optional.of(str);
    }

    public final void f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.a = j$.util.Optional.of(phoneAccountHandle);
    }

    public final void g(defpackage.skp skpVar) {
        aooh.f(skpVar, "uiModel");
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        this.a = new defpackage.skq(skpVar, instantNow);
    }

    public final defpackage.pux h() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: surfaceTexture");
        }
        return new defpackage.pux((android.graphics.SurfaceTexture) obj, (j$.util.Optional) this.b);
    }

    public final void i(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null dimensions");
        }
        this.b = optional;
    }

    public final defpackage.pcq j() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new defpackage.pcq((aify) obj2, (java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" audioDevices");
        }
        if (this.b == null) {
            sb.append(" callId");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null audioDevices");
        }
        this.a = aifyVar;
    }

    public final void l(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.b = str;
    }

    public whl(aazc aazcVar) {
        aooh.f(aazcVar, "clock");
    }

    public whl(az azVar) {
        aooh.f(azVar, "activity");
    }

    public whl(byte[] bArr, byte[] bArr2) {
        this.b = j$.util.Optional.empty();
    }

    public whl() {
    }
}
