package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adgm {
    public defpackage.aigb a;
    public defpackage.aigf b;
    private java.lang.String c;
    private int d;
    private defpackage.aify e;
    private defpackage.aigb f;
    private defpackage.aigf g;
    private byte h;

    public final com.google.android.libraries.micore.superpacks.SuperpackManifest a() {
        java.lang.String str;
        defpackage.aigb aigbVar = this.a;
        if (aigbVar != null) {
            this.b = aigbVar.e(true);
        } else if (this.b == null) {
            this.b = defpackage.aikj.b;
        }
        defpackage.aigb aigbVar2 = this.f;
        if (aigbVar2 != null) {
            this.g = aigbVar2.e(true);
        } else if (this.g == null) {
            this.g = defpackage.aikj.b;
        }
        if (this.h == 1 && (str = this.c) != null && this.e != null) {
            com.google.android.libraries.micore.superpacks.AutoValue_SuperpackManifest autoValue_SuperpackManifest = new com.google.android.libraries.micore.superpacks.AutoValue_SuperpackManifest(str, this.d, this.b, this.g);
            defpackage.adho.e(autoValue_SuperpackManifest.a);
            defpackage.adik.k("version", autoValue_SuperpackManifest.b);
            return autoValue_SuperpackManifest;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" name");
        }
        if (this.h == 0) {
            sb.append(" version");
        }
        if (this.e == null) {
            sb.append(" indexSpecs");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        if (this.f == null) {
            if (this.g == null) {
                this.f = new defpackage.aigb(4);
            } else {
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                this.f = aigbVar;
                aigbVar.l(this.g);
                this.g = null;
            }
        }
        this.f.i(packManifest.j(), packManifest);
    }

    public final void c(defpackage.aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null indexSpecs");
        }
        this.e = aifyVar;
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.c = str;
    }

    public final void e(int i) {
        this.d = i;
        this.h = (byte) 1;
    }
}
