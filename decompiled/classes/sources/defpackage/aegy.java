package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aegy implements defpackage.adxb {
    private final defpackage.ajzc a;

    public aegy(defpackage.ajzc ajzcVar) {
        this.a = ajzcVar;
    }

    @Override // defpackage.adxb
    public final defpackage.ajcq a(adxd adxdVar) {
        ajzk ajzkVar = new ajzk();
        ajzkVar.f(adxdVar.a.toString());
        for (java.util.Map.Entry entry : adxdVar.c.entrySet()) {
            java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
            while (it.hasNext()) {
                ajzkVar.b(ajzj.a(((defpackage.adxc) entry.getKey()).f), (java.lang.String) it.next());
            }
        }
        byte[] bArr = adxdVar.d;
        if (bArr != null) {
            ajzkVar.e(adxdVar.b, (java.nio.ByteBuffer) java.nio.ByteBuffer.allocateDirect(bArr.length).put(bArr).position(0));
            ajzkVar.d("POST");
        } else {
            ajzkVar.d("GET");
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.a.a(new ajzm(ajzkVar)));
        adfe adfeVar = new adfe(10);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return ahrvVarG.h(adfeVar, ajbmVar).e(java.lang.Exception.class, new adfe(11), ajbmVar);
    }

    @Override // defpackage.adxb
    public final java.lang.String b() {
        return "tiktok";
    }
}
