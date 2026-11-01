package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apla {
    public final defpackage.apib a;
    public final defpackage.apks b;
    public java.util.List c;
    public int d;
    public final java.util.List e = new java.util.ArrayList();
    public final defpackage.zzx f;

    public apla(defpackage.apib apibVar, defpackage.zzx zzxVar, defpackage.apks apksVar) {
        java.util.List<java.net.Proxy> listSelect;
        java.util.List listF;
        this.a = apibVar;
        this.f = zzxVar;
        this.b = apksVar;
        this.c = defpackage.aokc.a;
        defpackage.apiw apiwVar = apibVar.i;
        java.net.Proxy proxy = apibVar.g;
        defpackage.apis apisVar = apksVar.c;
        if (proxy != null) {
            listF = java.util.Collections.singletonList(proxy);
            defpackage.aooh.e(listF, "singletonList(...)");
        } else {
            java.net.URI uriF = apiwVar.f();
            if (uriF.getHost() == null) {
                listF = defpackage.apjx.f(new java.net.Proxy[]{java.net.Proxy.NO_PROXY});
            } else {
                try {
                    listSelect = apibVar.h.select(uriF);
                } catch (java.lang.IllegalArgumentException unused) {
                    listSelect = null;
                }
                listF = (listSelect == null || listSelect.isEmpty()) ? defpackage.apjx.f(new java.net.Proxy[]{java.net.Proxy.NO_PROXY}) : defpackage.apjx.e(listSelect);
            }
        }
        this.c = listF;
        this.d = 0;
        defpackage.apis apisVar2 = this.b.c;
        if (this.c == null) {
            defpackage.aooh.i("proxies");
        }
    }

    public final boolean a() {
        return b() || !this.e.isEmpty();
    }

    public final boolean b() {
        return this.d < this.c.size();
    }
}
