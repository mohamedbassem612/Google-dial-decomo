package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aafb {
    public android.os.Bundle b;
    private final java.util.Map c = j$.util.DesugarCollections.synchronizedMap(new aca());
    public int a = 0;

    final void a(int i, int i2, android.content.Intent intent) {
        java.util.Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.aaey) it.next()).c(i, i2, intent);
        }
    }

    final void b(android.os.Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            ((defpackage.aaey) entry.getValue()).d(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    final void c() {
        this.a = 5;
        for (defpackage.aaey aaeyVar : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        java.util.Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.aaey) it.next()).h();
        }
    }

    final void e(android.os.Bundle bundle) {
        if (bundle != null) {
            for (java.util.Map.Entry entry : this.c.entrySet()) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                ((defpackage.aaey) entry.getValue()).g(bundle2);
                bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
            }
        }
    }

    final void f() {
        this.a = 2;
        java.util.Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.aaey) it.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        java.util.Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.aaey) it.next()).j();
        }
    }

    final void h(defpackage.aaey aaeyVar) {
        java.util.Map map = this.c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", aaeyVar);
        if (this.a > 0) {
            new aanh(android.os.Looper.getMainLooper()).post(new opo(this, aaeyVar, 20));
        }
    }

    final void i() {
        for (defpackage.aaey aaeyVar : this.c.values()) {
        }
    }

    final defpackage.aaey j(java.lang.Class cls) {
        return (defpackage.aaey) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
