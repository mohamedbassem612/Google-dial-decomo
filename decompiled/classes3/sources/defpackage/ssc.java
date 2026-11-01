package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssc implements zhg {
    private final android.content.Context a;
    private final zjm b;

    public ssc(android.content.Context context, zjm zjmVar) {
        aooh.f(context, "appContext");
        this.a = context;
        this.b = zjmVar;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(defpackage.akmz akmzVar, java.lang.String str, akzx akzxVar, aoln aolnVar) throws org.json.JSONException {
        defpackage.akni akniVar = akmzVar.c;
        if (akniVar == null) {
            akniVar = defpackage.akni.a;
        }
        aooh.e(akniVar, "getPhoneNumberEntity(...)");
        java.lang.String str2 = akniVar.b;
        aooh.e(str2, "getEntityName(...)");
        if (str2.length() > 0) {
            akmh akmhVar = null;
            if (akniVar.d.size() > 0) {
                defpackage.aknh aknhVar = (defpackage.aknh) akniVar.d.get(0);
                aooh.e(aknhVar, "getPhone(...)");
                akng akngVarB = akng.b(aknhVar.c);
                if (akngVarB == null) {
                    akngVarB = akng.m;
                }
                if (!akngVarB.equals(akng.a)) {
                    android.content.res.Resources resources = this.a.getResources();
                    aigf aigfVar = ssb.a;
                    akng akngVarB2 = akng.b(aknhVar.c);
                    if (akngVarB2 == null) {
                        akngVarB2 = akng.m;
                    }
                    java.lang.Object orDefault = aigfVar.getOrDefault(akngVarB2, new java.lang.Integer(0));
                    aooh.e(orDefault, "getOrDefault(...)");
                    j$.util.Optional optionalBU = mni.bU(resources, ((java.lang.Number) orDefault).intValue(), (java.lang.CharSequence) null);
                    defpackage.rhb rhbVar = new defpackage.rhb(new defpackage.skx(akzxVar, 17), 13);
                    if (true == optionalBU.isPresent()) {
                        rhbVar.a.a(optionalBU.get());
                    }
                }
            }
            int iAR = a.aR(akniVar.c);
            if (iAR == 0 || iAR != 4 || this.b.g().isEmpty()) {
                aigf aigfVar2 = ssb.a;
                defpackage.vaa vaaVar = new defpackage.vaa((android.net.Uri) null);
                if (!akniVar.b.isEmpty()) {
                    int iAR2 = a.aR(akniVar.c);
                    vaaVar.Z(akniVar.b, (iAR2 == 0 || iAR2 != 4) ? 0 : 30);
                    java.lang.String str3 = akniVar.b;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("data1", str3);
                    jSONObject.put("data2", str3);
                    jSONObject.put("data3", (java.lang.Object) null);
                    jSONObject.put("data4", (java.lang.Object) null);
                    jSONObject.put("data5", (java.lang.Object) null);
                    jSONObject.put("data6", (java.lang.Object) null);
                    jSONObject.put("data7", (java.lang.Object) null);
                    jSONObject.put("data8", (java.lang.Object) null);
                    jSONObject.put("data9", (java.lang.Object) null);
                    jSONObject.put("data10", (java.lang.Object) null);
                    jSONObject.put("data11", (java.lang.Object) null);
                    vaaVar.X("vnd.android.cursor.item/name", jSONObject);
                }
                if (akniVar.d.size() > 0) {
                    defpackage.aknh aknhVar2 = (defpackage.aknh) akniVar.d.get(0);
                    java.lang.String str4 = aknhVar2.b;
                    aigf aigfVar3 = ssb.a;
                    akng akngVarB3 = akng.b(aknhVar2.c);
                    if (akngVarB3 == null) {
                        akngVarB3 = akng.m;
                    }
                    vaaVar.aa(str4, (java.lang.Integer) aigfVar3.get(akngVarB3));
                } else {
                    vaaVar.aa(str, null);
                }
                if (akniVar.e.size() > 0) {
                    defpackage.akmi akmiVar = (defpackage.akmi) akniVar.e.get(0);
                    java.lang.String str5 = akmiVar.b;
                    aigf aigfVar4 = ssb.b;
                    int i = akmiVar.c;
                    if (i == 0) {
                        akmhVar = akmh.a;
                    } else if (i == 1) {
                        akmhVar = akmh.b;
                    } else if (i == 2) {
                        akmhVar = akmh.c;
                    } else if (i == 3) {
                        akmhVar = akmh.d;
                    }
                    if (akmhVar == null) {
                        akmhVar = akmh.e;
                    }
                    java.lang.Integer num = (java.lang.Integer) aigfVar4.get(akmhVar);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (str5 != null) {
                        jSONObject2.put("data1", str5);
                    }
                    if (num != null) {
                        num.intValue();
                        jSONObject2.put("data2", num.intValue());
                    }
                    vaaVar.X("vnd.android.cursor.item/postal-address_v2", jSONObject2);
                }
                if (akniVar.f.size() > 0) {
                    vaaVar.X("vnd.android.cursor.item/website", new org.json.JSONObject().put("data1", ((defpackage.aknr) akniVar.f.get(0)).b));
                }
                java.lang.String string = vaaVar.W().toString();
                akzxVar.u();
                defpackage.zhj zhjVar = (defpackage.zhj) akzxVar.b;
                defpackage.zhj zhjVar2 = defpackage.zhj.a;
                j$.util.Objects.requireNonNull(string);
                zhjVar.b |= 8;
                zhjVar.f = string;
            }
        }
        return akzxVar;
    }

    public final void b(akzx akzxVar) {
    }
}
