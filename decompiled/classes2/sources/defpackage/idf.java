package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idf implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ idf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.idh idhVar = (defpackage.idh) this.a;
            idhVar.e.a(qbc.hr);
            idhVar.j((j$.util.Optional) this.b, ruc.bG);
            return new defpackage.hyc(2);
        }
        if (i == 1) {
            defpackage.idh idhVar2 = (defpackage.idh) this.a;
            idhVar2.e.a(qbc.hr);
            idhVar2.j((j$.util.Optional) this.b, ruc.bF);
            return new defpackage.hyc(2);
        }
        if (i == 2) {
            return ((defpackage.nwb) this.a).d((int[]) this.b);
        }
        if (i == 3) {
            vdo vdoVar = (vdo) this.b;
            android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(vdoVar.b.getPackageName());
            aooh.f(uriBuildSourceUri, "uri");
            ojo ojoVar = vdoVar.c;
            zjm zjmVar = ojoVar.b;
            zce zceVar = zce.f;
            java.lang.Object obj = this.a;
            return zjm.j(zjmVar, zceVar, ajsz.bb(new wsc[]{wsc.G(uriBuildSourceUri.getEncodedAuthority()), wsc.G(ojoVar.j(uriBuildSourceUri)), wsc.G(java.lang.Integer.valueOf(((android.content.ContentValues) obj).size()))}), new defpackage.obp(ojoVar, uriBuildSourceUri, obj, 2, (byte[]) null), new defpackage.mws(18), 16);
        }
        if (i == 4) {
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = this.b;
            return ahvr.E(new rqy(obj3, obj2, 12), ((vfn) obj3).c);
        }
        java.lang.Object obj4 = this.a;
        if (i == 5) {
            java.lang.Object obj5 = this.b;
            return ahvr.E(new rqy(obj5, obj4, 15), ((vmi) obj5).d);
        }
        ahvr.ci(obj4);
        android.net.Uri handle = ((android.telecom.Call) obj4).getDetails().getHandle();
        java.lang.String schemeSpecificPart = handle == null ? "" : handle.getSchemeSpecificPart();
        zmn zmnVar = (zmn) this.b;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zmnVar.l.X(schemeSpecificPart));
        zmnVar.i = j$.util.Optional.of(boolValueOf);
        return boolValueOf;
    }

    public /* synthetic */ idf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
