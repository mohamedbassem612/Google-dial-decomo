package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uyb {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/util/call/CallUtil");
    private static boolean b;
    private static boolean c;

    public static int a(android.content.Context context) {
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(context, "android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        if (((java.lang.Boolean) ((defpackage.uya) defpackage.agab.aH(context, defpackage.uya.class)).hV().a()).booleanValue()) {
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/util/call/CallUtil", "getVideoCallingAvailability", 93, "CallUtil.java")).v("disallow RTT to Videocall transition due to flag");
            j$.util.Optional optionalG = ((defpackage.uya) defpackage.agab.aH(context, defpackage.uya.class)).nb().g();
            if ((optionalG.isPresent() && ((defpackage.tcs) ((defpackage.aogc) optionalG.orElseThrow()).b).a().equals(defpackage.tcp.ALWAYS_VISIBLE)) || sns.m(context)) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/util/call/CallUtil", "getVideoCallingAvailability", 96, "CallUtil.java")).v("Videocall disabled due to RttAlwaysVisible=true");
                return 0;
            }
        }
        java.util.Iterator it = ((defpackage.uya) defpackage.agab.aH(context, defpackage.uya.class)).dO().s().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            j$.util.Optional optionalJ = ((defpackage.uya) defpackage.agab.aH(context, defpackage.uya.class)).dO().j((android.telecom.PhoneAccountHandle) it.next());
            if (optionalJ.isPresent() && ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).hasCapabilities(8)) {
                i++;
                if (((android.telecom.PhoneAccount) optionalJ.orElseThrow()).hasCapabilities(256)) {
                    i2++;
                }
            }
        }
        if (i == 1) {
            if (i2 == 1) {
                return 3;
            }
        } else if (i <= 0) {
            return 0;
        }
        return 1;
    }

    public static android.net.Uri b(java.lang.String str) {
        return (str == null || !(str.contains("@") || str.contains("%40"))) ? android.net.Uri.fromParts("tel", str, null) : android.net.Uri.fromParts("sip", str, null);
    }

    public static boolean c(android.content.Context context) {
        int iA = a(context) & 1;
        boolean z = 1 == iA;
        if (!b) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/util/call/CallUtil", "isVideoEnabled", 142, "CallUtil.java")).y("isVideoEnabled: %b", java.lang.Boolean.valueOf(z));
            b = true;
            c = z;
        } else if (c != iA) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/util/call/CallUtil", "isVideoEnabled", 146, "CallUtil.java")).L("isVideoEnabled changed from %b to %b", c, z);
            c = z;
        }
        return z;
    }
}
