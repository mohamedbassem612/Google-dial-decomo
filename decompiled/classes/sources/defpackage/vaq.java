package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vaq implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vaq(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((android.service.notification.StatusBarNotification) obj).getTag();
            case 1:
                return java.lang.Long.toString(((java.lang.Long) obj).longValue());
            case 2:
                return defpackage.ttj.k((defpackage.vzi) obj);
            case 3:
                defpackage.kiu kiuVar = ((uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = defpackage.kiu.a;
                }
                return kiuVar.g;
            case 4:
                return ((defpackage.vmk) obj).c;
            case 5:
                hkd hkdVar = (hkd) obj;
                java.lang.String[] strArr = defpackage.vva.a;
                return hkdVar;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((hkd) obj).c;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((java.util.Map.Entry) obj).getKey();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.aoin) ((defpackage.zjm) ((java.util.Map.Entry) obj).getValue()).f().orElseThrow();
            case 9:
                return ((defpackage.aoin) ((defpackage.zjm) obj).f().orElseThrow()).a();
            case 10:
                return (defpackage.mhc) obj;
            case 11:
                return (defpackage.zta) ((defpackage.aoin) ((java.util.Map.Entry) obj).getValue()).a();
            case 12:
                return new defpackage.adnq();
            case 13:
                return defpackage.adqb.a((com.google.android.libraries.micore.superpacks.common.PackManifest) obj);
            case 14:
                return ((defpackage.adsi) obj).a;
            case 15:
                return (j$.util.Optional) aa$.ExternalSyntheticApiModelOutline1.m(fh$.ExternalSyntheticApiModelOutline0.m(obj));
            case 16:
                return ((defpackage.adsi) ((j$.util.Optional) obj).get()).a;
            case 17:
                java.lang.String strA = defpackage.afea.a((java.lang.String) obj, null);
                return strA == null ? "" : strA;
            case 18:
                java.lang.Long l = defpackage.afew.a;
                return new java.util.concurrent.Semaphore(1);
            case 19:
                ?? r8 = ((uzx) obj).a;
                defpackage.aift aiftVar = new defpackage.aift(r8.size());
                aikb aikbVar = aikb.a;
                java.util.Collections.sort(r8, aika.a);
                aiig it = r8.iterator();
                aiig aiigVar = it instanceof aiig ? it : new aiig(it);
                while (aiigVar.hasNext()) {
                    aikb aikbVar2 = (aikb) aiigVar.next();
                    while (aiigVar.hasNext()) {
                        if (!aiigVar.b) {
                            aiigVar.c = aiigVar.a.next();
                            aiigVar.b = true;
                        }
                        aikb aikbVar3 = (aikb) aiigVar.c;
                        aiem aiemVar = aikbVar2.b;
                        aiem aiemVar2 = aikbVar3.c;
                        defpackage.ahvr.bW(((aiemVar.a(aikbVar3.b) < 0 || aikbVar2.c.a(aiemVar2) > 0) ? aikbVar3 : aikbVar2).b(), "Overlapping ranges not permitted but found %s overlapping %s", aikbVar2, aikbVar3);
                        aikb aikbVar4 = (aikb) aiigVar.next();
                        aiem aiemVar3 = aikbVar4.b;
                        aiem aiemVar4 = aikbVar4.c;
                    }
                    aiftVar.i(aikbVar2);
                }
                defpackage.aify aifyVarH = aiftVar.g();
                if (aifyVarH.isEmpty()) {
                    return aiha.a;
                }
                return (((defpackage.aike) aifyVarH).d == 1 && ((aikb) defpackage.ahvr.bm(aifyVarH)).equals(aikb.a)) ? aiha.b : new aiha(aifyVarH);
            default:
                return ((defpackage.aift) obj).g();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
