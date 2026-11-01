package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipu extends defpackage.aipl {
    private static final boolean a = defpackage.aipt.a();
    private static final boolean b;
    private static final defpackage.aipk c;

    static {
        boolean z = true;
        if (android.os.Build.FINGERPRINT != null && !"robolectric".equals(android.os.Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new defpackage.aips();
    }

    static java.lang.Class p() {
        return dalvik.system.VMStack.getStackClass2();
    }

    static java.lang.String q() {
        try {
            return dalvik.system.VMStack.getStackClass2().getName();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return defpackage.aipt.class.getName().equals(q());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.aipl
    protected defpackage.aion e(java.lang.String str) {
        char cCharAt;
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aipx.d;
        if (atomicReference.get() != null) {
            return ((defpackage.aipq) atomicReference.get()).a(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace('$', '.');
                break;
            }
        } while (cCharAt != '.');
        defpackage.aipx aipxVar = new defpackage.aipx(str);
        defpackage.aipw.a.offer(aipxVar);
        if (atomicReference.get() != null) {
            defpackage.aipx.e();
        }
        return aipxVar;
    }

    @Override // defpackage.aipl
    protected defpackage.aipk h() {
        return c;
    }

    @Override // defpackage.aipl
    protected defpackage.aiql j() {
        return defpackage.aipy.a;
    }

    @Override // defpackage.aipl
    protected java.lang.String m() {
        return "platform: Android";
    }
}
