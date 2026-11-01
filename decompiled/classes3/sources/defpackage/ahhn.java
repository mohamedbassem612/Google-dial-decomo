package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahhn implements emj {
    final /* synthetic */ az a;
    final /* synthetic */ ahhp b;
    final /* synthetic */ android.content.ComponentCallbacks2 c;
    final /* synthetic */ defpackage.ahho d;

    public ahhn(defpackage.ahho ahhoVar, az azVar, ahhp ahhpVar, android.content.ComponentCallbacks2 componentCallbacks2) {
        this.a = azVar;
        this.b = ahhpVar;
        this.c = componentCallbacks2;
        j$.util.Objects.requireNonNull(ahhoVar);
        this.d = ahhoVar;
    }

    public final void b(emx emxVar) {
        defpackage.ahho ahhoVar = this.d;
        java.util.Map map = ahhoVar.b.a;
        az azVar = this.a;
        java.util.Set set = (java.util.Set) map.get(azVar);
        if (set != null) {
            set.remove(this.b);
        }
        azVar.unregisterComponentCallbacks(this.c);
        ahhoVar.a.P().d(this);
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
