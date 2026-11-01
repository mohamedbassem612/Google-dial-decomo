package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evx implements defpackage.evr {
    private final android.content.Context a;
    private final java.util.List b = new java.util.ArrayList();
    private final defpackage.evr c;
    private defpackage.evr d;
    private defpackage.evr e;
    private defpackage.evr f;
    private defpackage.evr g;
    private defpackage.evr h;
    private defpackage.evr i;
    private defpackage.evr j;
    private defpackage.evr k;

    public evx(android.content.Context context, defpackage.evr evrVar) {
        this.a = context.getApplicationContext();
        this.c = evrVar;
    }

    private final defpackage.evr g() {
        if (this.e == null) {
            defpackage.evl evlVar = new defpackage.evl(this.a);
            this.e = evlVar;
            h(evlVar);
        }
        return this.e;
    }

    private final void h(defpackage.evr evrVar) {
        int i = 0;
        while (true) {
            java.util.List list = this.b;
            if (i >= list.size()) {
                return;
            }
            evrVar.f((defpackage.ewm) list.get(i));
            i++;
        }
    }

    private static final void i(defpackage.evr evrVar, defpackage.ewm ewmVar) {
        if (evrVar != null) {
            evrVar.f(ewmVar);
        }
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) {
        defpackage.evr evrVar = this.k;
        ahvr.ci(evrVar);
        return evrVar.a(bArr, i, i2);
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) {
        defpackage.evr evrVarG;
        ahvr.bY(this.k == null);
        android.net.Uri uri = evvVar.a;
        java.lang.String scheme = uri.getScheme();
        java.lang.String str = eum.a;
        java.lang.String scheme2 = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme2) || j$.util.Objects.equals(scheme2, "file")) {
            java.lang.String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    defpackage.ewd ewdVar = new defpackage.ewd();
                    this.d = ewdVar;
                    h(ewdVar);
                }
                evrVarG = this.d;
                this.k = evrVarG;
            } else {
                evrVarG = g();
                this.k = evrVarG;
            }
        } else if ("asset".equals(scheme)) {
            evrVarG = g();
            this.k = evrVarG;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                defpackage.evo evoVar = new defpackage.evo(this.a);
                this.f = evoVar;
                h(evoVar);
            }
            evrVarG = this.f;
            this.k = evrVarG;
        } else if ("rtmp".equals(scheme)) {
            evrVarG = this.g;
            if (evrVarG == null) {
                try {
                    defpackage.evr evrVar = (defpackage.evr) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = evrVar;
                    h(evrVar);
                } catch (java.lang.ClassNotFoundException unused) {
                    defpackage.etr.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating RTMP extension", e);
                }
                evrVarG = this.g;
                if (evrVarG == null) {
                    evrVarG = this.c;
                    this.g = evrVarG;
                }
            }
            this.k = evrVarG;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                defpackage.ewo ewoVar = new defpackage.ewo();
                this.h = ewoVar;
                h(ewoVar);
            }
            evrVarG = this.h;
            this.k = evrVarG;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                defpackage.evp evpVar = new defpackage.evp();
                this.i = evpVar;
                h(evpVar);
            }
            evrVarG = this.i;
            this.k = evrVarG;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    defpackage.ewk ewkVar = new defpackage.ewk(this.a);
                    this.j = ewkVar;
                    h(ewkVar);
                }
                evrVarG = this.j;
            } else {
                evrVarG = this.c;
            }
            this.k = evrVarG;
        }
        return evrVarG.b(evvVar);
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        defpackage.evr evrVar = this.k;
        if (evrVar == null) {
            return null;
        }
        return evrVar.c();
    }

    @Override // defpackage.evr
    public final void d() {
        defpackage.evr evrVar = this.k;
        if (evrVar != null) {
            try {
                evrVar.d();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.evr
    public final java.util.Map e() {
        defpackage.evr evrVar = this.k;
        return evrVar == null ? java.util.Collections.EMPTY_MAP : evrVar.e();
    }

    @Override // defpackage.evr
    public final void f(defpackage.ewm ewmVar) {
        ahvr.ci(ewmVar);
        this.c.f(ewmVar);
        this.b.add(ewmVar);
        i(this.d, ewmVar);
        i(this.e, ewmVar);
        i(this.f, ewmVar);
        i(this.g, ewmVar);
        i(this.h, ewmVar);
        i(this.i, ewmVar);
        i(this.j, ewmVar);
    }
}
