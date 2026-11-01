package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class opv implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ opv(int i) {
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
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i;
        int i2;
        switch (this.$cid) {
            case 0:
                return ((java.lang.Boolean) obj).booleanValue();
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (((android.content.ContentValues) entry.getValue()).containsKey("number_attributes") && ((android.content.ContentValues) entry.getValue()).containsKey("number")) {
                    return true;
                }
                break;
            case 2:
                if (!defpackage.ahvr.cp(((upo) obj).e)) {
                    return true;
                }
                break;
            case 3:
                return defpackage.ahvr.cp(((upo) obj).e);
            case 4:
                android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
                if (!android.text.TextUtils.isEmpty(statusBarNotification.getTag()) && statusBarNotification.getTag().startsWith("VisualVoicemail_InboxFull_")) {
                    return true;
                }
                break;
            case 5:
                defpackage.vzi vziVar = (defpackage.vzi) obj;
                if (defpackage.ttj.l(vziVar) && vziVar.m && (i = vziVar.k) != -1 && (i2 = vziVar.l) != -1 && i == i2) {
                    return true;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((android.service.notification.StatusBarNotification) obj).getId() == 1) {
                    return true;
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                if ((((hkd) obj).b & 1) != 0) {
                    return true;
                }
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.zjm) ((java.util.Map.Entry) obj).getValue()).f().isPresent();
            case 9:
                return ((defpackage.zjm) obj).f().isPresent();
            case 10:
                return ((j$.util.Optional) obj).isPresent();
            case 11:
                return ((j$.util.Optional) obj).isPresent();
            default:
                return true;
        }
        return false;
    }
}
