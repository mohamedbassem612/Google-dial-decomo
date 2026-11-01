package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zph {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopeSelector");

    public static final int c(apqr apqrVar) {
        java.lang.String reason;
        android.telecom.Call callC = ((zpg) apqrVar.a(zpg.class)).c();
        if (j$.util.Objects.equals(ura.c(callC), "4")) {
            return 10000;
        }
        switch (callC.getState()) {
            case 0:
                return 11;
            case 1:
                return 3;
            case 2:
            case 13:
                return 1;
            case 3:
                return 9;
            case 4:
                return 8;
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopeSelector", "getRank", 90, "CallScopeSelector.kt")).w("undefined state %s", callC.getState());
                return 10000;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                android.telecom.DisconnectCause disconnectCause = callC.getDetails().getDisconnectCause();
                if (disconnectCause == null || !((disconnectCause.getCode() == 9 || disconnectCause.getCode() == -1) && (reason = disconnectCause.getReason()) != null && defpackage.aoov.G(reason, "IMS_MERGED_SUCCESSFULLY", false))) {
                    return 7;
                }
                ((defpackage.aimw) a.b().l("com/google/android/dialershared/incall/core/callscope/callscopes/impl/CallScopeSelector", "getRank", 76, "CallScopeSelector.kt")).v("Call scope ranked low because it was disconnected due to merge.");
                return 10000;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 4;
            case 9:
                return 2;
            case 10:
                return 6;
            case 11:
                return 5;
            case 12:
                return 10;
        }
    }

    public final j$.util.Optional a(defpackage.aify aifyVar) {
        defpackage.aooh.f(aifyVar, "scopes");
        if (aifyVar.isEmpty()) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        j$.util.Optional optionalOf = j$.util.Optional.of(b(aifyVar).get(0));
        defpackage.aooh.e(optionalOf, "of(...)");
        return optionalOf;
    }

    public final java.util.List b(defpackage.aify aifyVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(aifyVar);
        defpackage.ajsz.bo(arrayList, new bdt(new xpf(3), 13, (byte[]) null));
        return arrayList;
    }
}
