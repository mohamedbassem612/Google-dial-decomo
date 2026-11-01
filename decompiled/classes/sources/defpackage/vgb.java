package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vgb implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vgb(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.vcr vcrVar = defpackage.vgg.a;
                if (!((vdg) obj).g.isPresent()) {
                    return true;
                }
                break;
            case 1:
                return ((vdg) ((vff) obj).a).e;
            case 2:
                return ((java.lang.Boolean) obj).booleanValue();
            case 3:
                return j$.util.Objects.nonNull((vdg) obj);
            case 4:
                return ((defpackage.vdd) obj).equals(defpackage.vdd.VVM_CARRIER_UNKNOWN);
            case 5:
                return ((vhi) ((whl) obj).b).f().contains("$CNS-Greeting-On");
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((vme) obj).d;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aimz aimzVar = defpackage.vma.a;
                return ((vlw) obj).a.contains("audio/");
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (((android.telecom.PhoneAccountHandle) obj) != null) {
                    return true;
                }
                break;
            case 9:
                defpackage.vzi vziVar = (defpackage.vzi) obj;
                if (vziVar.h == 0 && "com.google.android.apps.tycho".equals(vziVar.c)) {
                    return true;
                }
                break;
            case 10:
                return ((java.lang.Boolean) obj).booleanValue();
            case 11:
                return ((defpackage.vzi) obj).m;
            case 12:
                return ((j$.util.Optional) obj).isPresent();
            case 13:
                return ((j$.util.Optional) obj).isPresent();
            case 14:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case 15:
                if (((amgo) obj).b == 3) {
                    return true;
                }
                break;
            case 16:
                return j$.util.Collection.-EL.stream(((wrf) obj).j).anyMatch(new defpackage.vgb(15));
            case 17:
                return "detection_model".equals(((acuh) obj).c);
            case 18:
                woo wooVar = ((wkt) ((apqr) obj).a(wkt.class)).lm().n().d;
                if (wooVar == null) {
                    wooVar = woo.a;
                }
                won wonVarB = won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = won.f;
                }
                if (wonVarB == won.d) {
                    return true;
                }
                break;
            case 19:
                amfw amfwVarB = amfw.b(((amfx) obj).e);
                if (amfwVarB == null) {
                    amfwVarB = amfw.a;
                }
                if (amfwVarB == amfw.b) {
                    return true;
                }
                break;
            default:
                int iO = defpackage.wsc.O(((wke) obj).e);
                if (iO != 0 && iO == 6) {
                    return true;
                }
                break;
        }
        return false;
    }
}
