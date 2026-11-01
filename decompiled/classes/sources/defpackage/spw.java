package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class spw implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor");
    private final defpackage.ajct b;
    private final defpackage.ojo c;

    public spw(defpackage.ajct ajctVar, defpackage.ojo ojoVar) {
        this.b = ajctVar;
        this.c = ojoVar;
    }

    private static defpackage.aigf j(defpackage.aihd aihdVar, java.util.Set set) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            hkd hkdVar = (hkd) it.next();
            defpackage.akzx akzxVarM = spl.a.m();
            int i = true != set.contains(hkdVar) ? 3 : 2;
            akzxVarM.u();
            spl splVar = akzxVarM.b;
            splVar.c = i - 1;
            splVar.b |= 1;
            aigbVar.i(hkdVar, akzxVarM.r());
        }
        return aigbVar.e(true);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "getMostRecentInfo", 105, "SystemBlockedNumberPhoneLookupContributor.java")).v("getMostRecentInfo");
        defpackage.nyf nyfVar = new defpackage.nyf(this, aigfVar, 3);
        long j = defpackage.ahqx.a;
        return this.b.submit(new defpackage.ajav(defpackage.ahns.c(false), nyfVar, 1));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        return this.b.submit(defpackage.ahqx.i(new qfb(this, hkdVar, 13, (byte[]) null)));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spl splVar = spnVar.g;
        return splVar == null ? spl.a : splVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "SystemBlockedNumberPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spl splVar = (spl) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(splVar);
        spnVar.g = splVar;
        spnVar.b |= 16;
    }

    public final defpackage.aigf i(defpackage.aihd aihdVar) throws defpackage.spv {
        defpackage.gus.aJ();
        defpackage.rsr rsrVar = new defpackage.rsr(aihdVar);
        defpackage.acc accVar = new defpackage.acc(0);
        try {
            java.lang.Object obj = rsrVar.b;
            defpackage.ailj it = ((defpackage.aigf) obj).keySet().iterator();
            if (it == null) {
                throw null;
            }
            defpackage.aihz aihzVar = new defpackage.aihz(it, 100);
            while (aihzVar.hasNext()) {
                defpackage.rsr rsrVarAF = new defpackage.kaw("e164_number").aF(aihzVar.next());
                android.database.Cursor cursorB = this.c.b(fh$.ExternalSyntheticApiModelOutline0.m(), new java.lang.String[]{"e164_number"}, (java.lang.String) rsrVarAF.b, (java.lang.String[]) rsrVarAF.a, null);
                while (cursorB != null) {
                    try {
                        if (!cursorB.moveToNext()) {
                            cursorB.close();
                            break;
                        }
                        defpackage.aihd aihdVar2 = (defpackage.aihd) ((defpackage.aigf) obj).get(cursorB.getString(0));
                        if (aihdVar2 == null) {
                            throw null;
                        }
                        accVar.addAll(aihdVar2);
                    } catch (java.lang.Throwable th) {
                        try {
                            cursorB.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "queryNumbers", (char) 181, "SystemBlockedNumberPhoneLookupContributor.java")).v("Ignored SecurityException when querying blocked numbers.");
                    return j(aihdVar, defpackage.aikn.a);
                }
            }
            java.lang.Object obj2 = rsrVar.a;
            defpackage.ailj it2 = ((defpackage.aigf) obj2).keySet().iterator();
            if (it2 == null) {
                throw null;
            }
            defpackage.aihz aihzVar2 = new defpackage.aihz(it2, 100);
            while (aihzVar2.hasNext()) {
                defpackage.rsr rsrVarAF2 = new defpackage.kaw("original_number").aF(aihzVar2.next());
                android.database.Cursor cursorB2 = this.c.b(fh$.ExternalSyntheticApiModelOutline0.m(), new java.lang.String[]{"original_number"}, (java.lang.String) rsrVarAF2.b, (java.lang.String[]) rsrVarAF2.a, null);
                while (cursorB2 != null) {
                    try {
                        if (!cursorB2.moveToNext()) {
                            cursorB2.close();
                            break;
                        }
                        defpackage.aihd aihdVar3 = (defpackage.aihd) ((defpackage.aigf) obj2).get(cursorB2.getString(0));
                        if (aihdVar3 == null) {
                            throw null;
                        }
                        accVar.addAll(aihdVar3);
                    } catch (java.lang.Throwable th3) {
                        try {
                            cursorB2.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "queryNumbers", (char) 181, "SystemBlockedNumberPhoneLookupContributor.java")).v("Ignored SecurityException when querying blocked numbers.");
                    return j(aihdVar, defpackage.aikn.a);
                }
            }
            return j(aihdVar, accVar);
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "queryNumbers", (char) 181, "SystemBlockedNumberPhoneLookupContributor.java")).v("Ignored SecurityException when querying blocked numbers.");
            return j(aihdVar, defpackage.aikn.a);
        } catch (java.lang.RuntimeException e2) {
            throw new defpackage.spv(e2);
        }
    }
}
