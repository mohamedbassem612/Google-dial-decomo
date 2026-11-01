package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pht implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ pht(aoss aossVar, java.util.Map map, defpackage.pdw pdwVar, j$.util.Optional optional, defpackage.yzr yzrVar, zzx zzxVar, int i) {
        this.$cid = i;
        this.c = aossVar;
        this.b = map;
        this.d = pdwVar;
        this.e = optional;
        this.f = yzrVar;
        this.a = zzxVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v10, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        int i2 = 0;
        if (i != 0) {
            java.lang.Object obj2 = this.f;
            java.lang.Object obj3 = this.e;
            return aosv.F((aoss) this.c, 0, new defpackage.pej(this.b, (defpackage.pdw) this.d, (j$.util.Optional) obj3, (defpackage.yzr) obj2, (zzx) obj, null), 3);
        }
        java.lang.Object obj4 = this.f;
        if (obj == defpackage.zna.ALLOWED) {
            j$.util.Optional optional = (j$.util.Optional) this.b;
            if (optional.isPresent()) {
                java.lang.String strSubstring = (java.lang.String) optional.orElseThrow();
                if (!android.text.TextUtils.isEmpty(strSubstring) && strSubstring.startsWith("sip:")) {
                    strSubstring = strSubstring.substring(4);
                }
                ?? r3 = this.c;
                if (ahvr.r((java.lang.CharSequence) r3, "CL")) {
                    return ahrv.g(((aogc) this.d).aH()).h(new defpackage.phr(strSubstring, i2), (java.util.concurrent.Executor) this.e);
                }
                android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                try {
                    return aiql.z(j$.util.Optional.ofNullable(((ssq) obj4).g(strSubstring, (java.lang.String) r3)));
                } finally {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
        return aiql.z(j$.util.Optional.empty());
    }

    public /* synthetic */ pht(defpackage.zna znaVar, j$.util.Optional optional, java.lang.String str, aogc aogcVar, ajct ajctVar, ssq ssqVar, int i) {
        this.$cid = i;
        this.a = znaVar;
        this.b = optional;
        this.c = str;
        this.d = aogcVar;
        this.e = ajctVar;
        this.f = ssqVar;
    }
}
