package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vls {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmGateway");
    public static final defpackage.aihd b = defpackage.aihd.t(200, 201, 202, 204);
    public static final defpackage.aihd c = defpackage.aihd.s(401, 408, 503);
    public final defpackage.ajct d;
    public final defpackage.vlg e;
    public final defpackage.vma f;
    public final defpackage.vdq g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.tvn j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;

    public vls(defpackage.ajct ajctVar, defpackage.vlg vlgVar, defpackage.vma vmaVar, defpackage.vdq vdqVar, defpackage.tvn tvnVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.d = ajctVar;
        this.e = vlgVar;
        this.f = vmaVar;
        this.g = vdqVar;
        this.j = tvnVar;
        this.k = aoinVar;
        this.l = aoinVar2;
        this.h = aoinVar3;
        this.i = aoinVar4;
    }

    public static ajzk d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] bytes = str2.getBytes();
        ajzk ajzkVar = new ajzk();
        ajzkVar.f(str);
        ajzkVar.d(str3);
        ajzkVar.e("application/json", java.nio.ByteBuffer.wrap(bytes));
        ajzkVar.b(ajzj.a("content-length"), java.lang.String.valueOf(bytes.length));
        return ajzkVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiii, java.lang.Object] */
    public static java.lang.String g(alic alicVar, java.lang.String str) {
        ?? r2 = alicVar.c;
        if (r2.s(ajzj.a(str))) {
            return defpackage.ahvr.p((java.lang.String) r2.c(ajzj.a(str)).get(0));
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Missing header %s", str));
    }

    public final defpackage.ajcq a(java.lang.String str) {
        if (str.contains("?")) {
            int iIndexOf = str.indexOf("?");
            int iIndexOf2 = str.indexOf("/oemclient");
            str = java.lang.String.valueOf(str.substring(0, iIndexOf)).concat(java.lang.String.valueOf(str.substring(iIndexOf2)));
        }
        ajzk ajzkVar = new ajzk();
        ajzkVar.d("GET");
        ajzkVar.f(str);
        return defpackage.ahvr.H(e(new ajzm(ajzkVar), 7), new vlk(6), this.d);
    }

    public final defpackage.ajcq b(java.lang.String str) {
        ajzk ajzkVar = new ajzk();
        ajzkVar.d("GET");
        ajzkVar.f(java.lang.String.valueOf(java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/folders/27a29814-dd8f-43ee-b768-19af98bf1d07", this.j.o(), str)).concat("%3FattrFilter%3DQuota"));
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(e(new ajzm(ajzkVar), 3));
        defpackage.vma vmaVar = this.f;
        j$.util.Objects.requireNonNull(vmaVar);
        vge vgeVar = new vge(vmaVar, 15);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarG.i(vgeVar, ajctVar).h(new vlk(10), ajctVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vmh */
    public final defpackage.ajcq c(java.lang.String str, defpackage.aify aifyVar, j$.util.Optional optional, int i) throws vmh {
        if (i >= ((java.lang.Long) this.l.a()).intValue()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmGateway", "retrieveVoicemailsRecursively", 147, "RestVvmGateway.java")).w("Stop retrieving voicemails because max page reached: %s", i);
            return defpackage.aiql.z(aifyVar);
        }
        defpackage.tvn tvnVar = this.j;
        try {
            return defpackage.ahrv.g(e(new ajzm(d(this.j.p(str), new org.json.JSONObject().put("selectionCriteria", new org.json.JSONObject().put("maxEntries", ((java.lang.Long) this.k.a()).intValue()).putOpt("fromCursor", optional.orElse((java.lang.Object) null)).put("searchScope", new org.json.JSONObject().put("resourceURL", java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/folders/27a29814-dd8f-43ee-b768-19af98bf1d07", tvnVar.o(), str))).put("searchCriteria", new org.json.JSONObject().put("criterion", new org.json.JSONArray().put(new org.json.JSONObject().put("type", "PurgedObject").put("value", ""))).put("operator", "Not")).put("sortCriteria", new org.json.JSONObject().put("criterion", new org.json.JSONArray().put(new org.json.JSONObject().put("type", "Date").put("order", "Descending"))))).toString(), "POST")), 4)).i(new vlq(this, aifyVar, str, i, 0), this.d);
        } catch (org.json.JSONException e) {
            throw new vmh(e);
        }
    }

    public final defpackage.ajcq e(ajzm ajzmVar, int i) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        defpackage.akzx akzxVarM = amsj.a.m();
        akzxVarM.u();
        amsj amsjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        amsjVar.b |= 1;
        amsjVar.c = string;
        akzxVarM.u();
        amsj amsjVar2 = akzxVarM.b;
        amsjVar2.f = i - 1;
        amsjVar2.b |= 32;
        akzxVarM.u();
        amsj amsjVar3 = akzxVarM.b;
        amsjVar3.d = 2;
        amsjVar3.b |= 4;
        this.g.a(akzxVarM.r());
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.e.a(ajzmVar));
        vlo vloVar = new vlo(this, i, string, jElapsedRealtime);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarG.h(vloVar, ajctVar).e(vcx.class, new vlp(this, string, jElapsedRealtime, 0), ajctVar);
    }

    public final void f(java.lang.String str, int i, long j) {
        defpackage.akzx akzxVarM = amsj.a.m();
        akzxVarM.u();
        amsj amsjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amsjVar.b |= 1;
        amsjVar.c = str;
        akzxVarM.u();
        amsj amsjVar2 = akzxVarM.b;
        amsjVar2.d = i - 1;
        amsjVar2.b |= 4;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        akzxVarM.u();
        amsj amsjVar3 = akzxVarM.b;
        amsjVar3.b |= 16;
        amsjVar3.e = jElapsedRealtime;
        this.g.a(akzxVarM.r());
    }
}
