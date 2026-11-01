package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abyv implements defpackage.xzp, defpackage.abyz {
    public static final defpackage.xur a;
    public final defpackage.xzp b;
    public final java.lang.Class c;
    public final ajct d;
    public final defpackage.afmo e;
    public final defpackage.vqu f;

    static {
        aiof.i("FifeModelLoader");
        a = new defpackage.xur("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", java.lang.Boolean.FALSE, new defpackage.agqy(1));
    }

    public abyv(defpackage.xzp xzpVar, defpackage.afmo afmoVar, java.lang.Class cls) {
        ajbn ajbnVar = new ajbn();
        this.b = xzpVar;
        this.e = afmoVar;
        this.c = cls;
        this.d = ajbnVar;
        afmoVar.c = this;
        this.f = new defpackage.vqu(2000L);
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        final defpackage.abyv abyvVar;
        final int i3;
        final int i4;
        final defpackage.abys abysVar = (defpackage.abys) obj;
        dzk.G("FifeModelLoader.beginSection");
        try {
            java.util.List listSingletonList = java.util.Collections.EMPTY_LIST;
            if (((java.lang.Boolean) xusVar.b(a)).booleanValue()) {
                final int i5 = 1;
                abyvVar = this;
                i3 = i;
                i4 = i2;
                listSingletonList = java.util.Collections.singletonList(new defpackage.abyx(abysVar, i3, i4, new defpackage.abyw(abyvVar) { // from class: abyt
                    public final /* synthetic */ defpackage.abyv a;

                    {
                        this.a = abyvVar;
                    }

                    @Override // defpackage.abyw
                    public final defpackage.xzg a() {
                        int i6 = i5;
                        int i7 = i4;
                        int i8 = i3;
                        defpackage.abys abysVar2 = abysVar;
                        defpackage.abyv abyvVar2 = this.a;
                        return i6 != 0 ? abyvVar2.c(abysVar2, i8, i7, false, null) : abyvVar2.c(abysVar2, i8, i7, true, null);
                    }
                }));
            } else {
                abyvVar = this;
                i3 = i;
                i4 = i2;
            }
            final int i6 = 0;
            return new ucm(new defpackage.abyx(abysVar, i3, i4, new defpackage.abyw(abyvVar) { // from class: abyt
                public final /* synthetic */ defpackage.abyv a;

                {
                    this.a = abyvVar;
                }

                @Override // defpackage.abyw
                public final defpackage.xzg a() {
                    int i7 = i6;
                    int i8 = i4;
                    int i9 = i3;
                    defpackage.abys abysVar2 = abysVar;
                    defpackage.abyv abyvVar2 = this.a;
                    return i7 != 0 ? abyvVar2.c(abysVar2, i9, i8, false, null) : abyvVar2.c(abysVar2, i9, i8, true, null);
                }
            }), listSingletonList, new defpackage.abyu(abyvVar, abysVar, i3, i4, xusVar));
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final defpackage.xzg c(defpackage.abys abysVar, int i, int i2, boolean z, defpackage.xzh xzhVar) {
        dzk.G("FifeModelLoader.buildGlideUrl");
        boolean z2 = false;
        if (z && xzhVar == null) {
            z2 = true;
        }
        if (z2) {
            try {
                defpackage.xzg xzgVar = (defpackage.xzg) this.f.w(abysVar, i, i2);
                if (xzgVar != null) {
                    return xzgVar;
                }
            } finally {
                android.os.Trace.endSection();
            }
        }
        java.lang.String str = ((com.google.android.libraries.glide.fife.ProvidedFifeUrl) abysVar.a).b;
        ahvr.ci(str);
        java.lang.String strB = defpackage.afbo.b(str, abysVar.b.b, defpackage.abyy.b(i), defpackage.abyy.b(i2));
        if (strB != null) {
            str = strB;
        }
        if (xzhVar == null) {
            defpackage.afmo afmoVar = this.e;
            aooh.f(abysVar, "fifeModel");
            xzhVar = afmoVar.a((android.accounts.Account) abysVar.c.a.a);
        }
        defpackage.xzg xzgVar2 = new defpackage.xzg(str, xzhVar);
        if (z2) {
            this.f.x(abysVar, i, i2, xzgVar2);
        }
        return xzgVar2;
    }
}
