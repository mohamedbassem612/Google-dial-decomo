package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kon {
    private static final aimz a = aimz.i("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback");

    public static isq a(android.content.Context context, kiu kiuVar) {
        j$.util.Optional optionalG = ((kom) agab.aH(context, kom.class)).mE().g();
        defpackage.kdb kdbVar = new defpackage.kdb(kiuVar, 8);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((aogc) optionalG.get()).bc((kiu) kdbVar.a));
        }
        return (isq) optionalG.orElse(isq.a);
    }

    public static mmy b(android.content.Context context, kiu kiuVar) {
        return ((kom) agab.aH(context, kom.class)).qS().O(kiuVar);
    }

    public static java.lang.String c(defpackage.kip kipVar) {
        wgu wguVar = kipVar.s;
        if (wguVar == null) {
            wguVar = wgu.a;
        }
        java.lang.String str = wguVar.f;
        if (str.isEmpty()) {
            wxp wxpVar = kipVar.o;
            if (wxpVar == null) {
                wxpVar = wxp.a;
            }
            str = wxpVar.d;
            if (str.isEmpty()) {
                a.bI(a.d(), "Unique call id is empty", "com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", (char) 174, "CallLogTranscriptAudioFeedback.java", zct.b);
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[PHI: r0
      0x00b2: PHI (r0v13 java.lang.String) = (r0v12 java.lang.String), (r0v14 java.lang.String) binds: [B:27:0x008e, B:29:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    public static java.lang.String d(android.content.Context context, kiu kiuVar) {
        wgu wguVar = kiuVar.I;
        if (wguVar == null) {
            wguVar = wgu.a;
        }
        java.lang.String str = wguVar.f;
        if (str.isEmpty()) {
            wxp wxpVar = kiuVar.C;
            if (wxpVar == null) {
                wxpVar = wxp.a;
            }
            str = wxpVar.d;
            if (str.isEmpty()) {
                defpackage.kir kirVar = kiuVar.D;
                if (kirVar == null) {
                    kirVar = defpackage.kir.a;
                }
                java.lang.String str2 = kirVar.h;
                if (!str2.isEmpty()) {
                    a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 135, "CallLogTranscriptAudioFeedback.java").v("Got unique call id from CallScreenDetails");
                    return str2;
                }
                java.lang.String str3 = b(context, kiuVar).i;
                if (!str3.isEmpty()) {
                    a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 142, "CallLogTranscriptAudioFeedback.java").v("Got unique call ID from DobbyCallLogDetails");
                    return str3;
                }
                str = a(context, kiuVar).c;
                if (!str.isEmpty()) {
                    a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 149, "CallLogTranscriptAudioFeedback.java").v("Got unique call ID from BeeslyCallLogDetails");
                } else if (g(context)) {
                    str = f(context).c;
                    if (str.isEmpty()) {
                        a.bI(a.d(), "Unique call id is empty", "com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", (char) 162, "CallLogTranscriptAudioFeedback.java", zct.b);
                    } else {
                        a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 157, "CallLogTranscriptAudioFeedback.java").v("Got unique call ID from FermatCallLogDetails");
                    }
                } else {
                    a.bI(a.d(), "Unique call id is empty", "com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", (char) 162, "CallLogTranscriptAudioFeedback.java", zct.b);
                }
            } else {
                a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 128, "CallLogTranscriptAudioFeedback.java").v("Got unique call id from AtlasCallDetails");
            }
        } else {
            a.b().l("com/android/dialer/calllogutils/CallLogTranscriptAudioFeedback", "getUniqueCallId", 122, "CallLogTranscriptAudioFeedback.java").v("Got unique call id from XatuCallDetails");
        }
        return str;
    }

    public static boolean e(android.content.Context context) {
        j$.util.Optional optionalG = ((kom) agab.aH(context, kom.class)).mW().g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.omq) optionalG.get()).c()));
        }
        return ((java.lang.Boolean) optionalG.orElse(java.lang.Boolean.FALSE)).booleanValue();
    }

    public static defpackage.kos f(android.content.Context context) {
        j$.util.Optional optionalG = ((kom) agab.aH(context, kom.class)).mW().g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.omq) optionalG.get()).d());
        }
        defpackage.kos kosVar = (defpackage.kos) optionalG.orElse((java.lang.Object) null);
        return kosVar == null ? defpackage.kos.a : kosVar;
    }

    public static boolean g(android.content.Context context) {
        if (f(context).b) {
            return e(context);
        }
        return false;
    }
}
