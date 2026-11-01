package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kju implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kju(int i) {
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

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return (defpackage.aoin) ((java.util.Map.Entry) obj).getValue();
            case 1:
                int i = defpackage.hug.b;
                return ((java.lang.String) obj).toUpperCase(java.util.Locale.US);
            case 2:
                return (defpackage.kfh) ((defpackage.aoin) obj).a();
            case 3:
                return java.lang.Long.toString(((java.lang.Long) obj).longValue());
            case 4:
                return java.lang.Long.valueOf(((kdy) obj).a);
            case 5:
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Long.valueOf(((kdy) obj).a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return (defpackage.ypm) obj;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.ypm) ((java.util.Map.Entry) obj).getKey();
            case 9:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                try {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) entry.getValue();
                    defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
                    return (defpackage.lje) defpackage.a.h(future);
                } catch (java.util.concurrent.ExecutionException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ljf.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "getModelAvailability", (char) 175, "CallScreenModelChooser.java")).y("unfinished availability check for model: %s", ((defpackage.ypm) entry.getKey()).name());
                    return defpackage.lje.b;
                }
            case 10:
                java.util.List list = (java.util.List) obj;
                int i2 = defpackage.okj.d;
                return java.lang.String.valueOf(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            case 11:
                int i3 = defpackage.okj.d;
                return defpackage.gus.aw((java.lang.String) obj);
            case 12:
                return (java.lang.String) obj;
            case 13:
                return (java.lang.String) obj;
            case 14:
                return (java.lang.String) obj;
            case 15:
                return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
            case 16:
                return (java.lang.String) obj;
            case 17:
                return defpackage.gus.av(((java.lang.Integer) obj).intValue());
            case 18:
                return (java.lang.String) obj;
            case 19:
                return defpackage.gus.au(((defpackage.aify) obj).size());
            default:
                return (hkd) ((java.util.Map.Entry) obj).getKey();
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
