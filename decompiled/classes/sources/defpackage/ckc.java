package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ckc implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ckc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.czi cziVar;
        switch (this.$cid) {
            case 0:
                return obj;
            case 1:
                return new defpackage.cjw((java.util.Map) obj);
            case 2:
                synchronized (defpackage.ckw.b) {
                    java.util.List list = defpackage.ckw.g;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.aonj) list.get(i)).a(obj);
                    }
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.aonj aonjVar = defpackage.ckw.a;
                return defpackage.aojh.a;
            case 4:
                return java.lang.Boolean.valueOf(!(((defpackage.cmu) obj) instanceof defpackage.cmr));
            case 5:
                int i2 = defpackage.cnn.h;
                return java.lang.Boolean.valueOf(((defpackage.dij) obj).h().f(defpackage.din.C));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                int i3 = defpackage.cso.v;
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.dbk) obj).i = true;
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aojh.a;
            case 9:
                defpackage.dbk dbkVar = (defpackage.dbk) obj;
                defpackage.dbk dbkVar2 = dbkVar instanceof defpackage.dbk ? dbkVar : null;
                if (dbkVar2 != null && dbkVar2.D) {
                    java.util.Objects.toString(dbkVar);
                    defpackage.cwh.d("Apply is called on deactivated node ".concat(java.lang.String.valueOf(dbkVar)));
                }
                return defpackage.aojh.a;
            case 10:
                dda ddaVar = (dda) obj;
                if (ddaVar.B() && (cziVar = ddaVar.c) != null) {
                    ddaVar.b.T(cziVar);
                }
                return defpackage.aojh.a;
            case 11:
                ((defpackage.dah) obj).i().c = false;
                return defpackage.aojh.a;
            case 12:
                ((defpackage.dah) obj).i().d = false;
                return defpackage.aojh.a;
            case 13:
                defpackage.dah dahVar = (defpackage.dah) obj;
                dahVar.i().e = dahVar.i().d;
                return defpackage.aojh.a;
            case 14:
                ((defpackage.dah) obj).i().d = false;
                return defpackage.aojh.a;
            case 15:
                defpackage.dah dahVar2 = (defpackage.dah) obj;
                dahVar2.i().e = dahVar2.i().d;
                return defpackage.aojh.a;
            case 16:
                ((defpackage.dah) obj).i().c = false;
                return defpackage.aojh.a;
            case 17:
                defpackage.dck dckVar = (defpackage.dck) obj;
                defpackage.dbk dbkVar3 = dckVar.w;
                try {
                    if (dckVar.B()) {
                        dckVar.az(true);
                        break;
                    }
                    return defpackage.aojh.a;
                } catch (java.lang.Throwable th) {
                    dbkVar3.ar(th);
                    throw new defpackage.aoiq();
                }
            case 18:
                defpackage.aonj aonjVar2 = defpackage.dck.s;
                defpackage.dct dctVar = ((defpackage.dck) obj).L;
                if (dctVar != null) {
                    dctVar.invalidate();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.dcq dcqVar = (defpackage.dcq) obj;
                if (dcqVar.B()) {
                    dcqVar.b.v();
                }
                return defpackage.aojh.a;
            default:
                defpackage.dbk dbkVar4 = (defpackage.dbk) obj;
                if (dbkVar4.al()) {
                    dbkVar4.U(false, true, true);
                }
                return defpackage.aojh.a;
        }
    }
}
