package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itd implements abwm {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/data/BeeslyDataChangeLogger");

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private static final java.lang.String b(defpackage.itt ittVar) throws aois {
        int iV = a.v(ittVar);
        if (iV != 0) {
            if (iV == 1) {
                return ((defpackage.itv) ittVar).a == 2 ? "transientError" : "terminalError";
            }
            if (iV == 2) {
                return "Generating";
            }
            throw new aois();
        }
        int i = ((defpackage.its) ittVar).a - 1;
        if (i == 0) {
            return "Unknown";
        }
        if (i != 1) {
            return i != 2 ? "Clean" : "Spam";
        }
        return "Scam";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private static final java.lang.String c(defpackage.itc itcVar) throws aois {
        java.lang.String str;
        defpackage.itr itrVar = itcVar.b;
        if (itrVar != null) {
            j$.util.Objects.checkIndex(0, 4);
            if (itrVar instanceof defpackage.itx) {
                str = "GeneratingCallActions";
            } else if (itrVar instanceof defpackage.itp) {
                str = "CallActions";
            } else {
                if (!(itrVar instanceof defpackage.itu)) {
                    throw new aois();
                }
                str = "ErrorGeneratingCallActions";
            }
        } else {
            str = null;
        }
        defpackage.itt ittVar = itcVar.k;
        java.lang.String strB = ittVar != null ? b(ittVar) : null;
        defpackage.itt ittVar2 = itcVar.l;
        java.lang.String strB2 = ittVar2 != null ? b(ittVar2) : null;
        java.lang.Integer num = itcVar.j;
        java.lang.String str2 = itcVar.f;
        java.lang.Long l = itcVar.e;
        java.lang.String str3 = itcVar.d;
        java.lang.String str4 = itcVar.c;
        java.lang.Long l2 = itcVar.i;
        return "callId: " + itcVar.h + ", callEndedTimeStamp: " + l2 + ", transcriptionPath: " + str4 + ", transcriptionText: " + str3 + ", transcriptionCreationTimestamp: " + l + ", audioRecordingPath: " + str2 + ", callType: " + num + ", callActionsState: " + str + ", userSpamVerdict: " + strB + ", aiCoreSpamVerdict: " + strB2 + ", spamContentBannerDismissed: " + itcVar.m + ", isEligibleForSurvey: " + itcVar.n;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(ahbq ahbqVar, aoln aolnVar) throws aois {
        for (java.util.Map.Entry entry : ahbqVar.c.entrySet()) {
            aimw aimwVarL = a.b().l("com/android/dialer/beesly/impl/data/BeeslyDataChangeLogger", "onKeyValueChange", 20, "BeeslyDataChangeLogger.kt");
            java.lang.Object key = entry.getKey();
            defpackage.itc itcVar = (defpackage.itc) ((abwl) entry.getValue()).b();
            java.lang.String strC = null;
            java.lang.String strC2 = itcVar != null ? c(itcVar) : null;
            defpackage.itc itcVar2 = (defpackage.itc) ((abwl) entry.getValue()).a();
            if (itcVar2 != null) {
                strC = c(itcVar2);
            }
            aimwVarL.M("beesly data changed for %s, from %s to %s", key, strC2, strC);
        }
        return aojh.a;
    }
}
