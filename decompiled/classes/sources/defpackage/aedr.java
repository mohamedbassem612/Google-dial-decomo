package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aedr implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        acll acllVar = (acll) obj;
        int iOrdinal = acllVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.aksr.CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG;
        }
        if (iOrdinal == 1) {
            return defpackage.aksr.CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE;
        }
        if (iOrdinal == 2) {
            return defpackage.aksr.CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NOTIFICATION;
        }
        if (iOrdinal == 3) {
            return defpackage.aksr.CUSTOM_UI_TYPE_GHA_FSI;
        }
        if (iOrdinal == 4) {
            return defpackage.aksr.CUSTOM_UI_TYPE_CHIME_DEMO_DIALOG;
        }
        if (iOrdinal == 5) {
            return defpackage.aksr.CUSTOM_UI_TYPE_EDITORS_ANDROID_PROMO_TOOLTIP;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(acllVar))));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
