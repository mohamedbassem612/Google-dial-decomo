package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdf extends defpackage.abcq {
    public abdf() {
        super(defpackage.zvl.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        ahwt ahwtVarH;
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 5) {
            throw new java.lang.IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvu zvuVar = zvzVar.c == 5 ? (defpackage.zvu) zvzVar.d : defpackage.zvu.a;
        ahvr.ci(zvuVar);
        int i = zvuVar.b;
        int iX = a.X(i);
        if (iX == 0) {
            throw null;
        }
        int i2 = iX - 1;
        if (i2 == 0) {
            if (i != 1 || !((java.lang.Boolean) zvuVar.c).booleanValue()) {
                return abcvVar;
            }
            defpackage.abcu abcuVar = new defpackage.abcu(abcvVar);
            abcuVar.c();
            return abcuVar.a();
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.RuntimeException(null, null);
                }
                android.util.Log.w("AppDoctorRestartUtil", "ProcessRestartFixConfig has no restart choice configured.");
                return abcvVar;
            }
            if (i != 3 || !((java.lang.Boolean) zvuVar.c).booleanValue()) {
                return abcvVar;
            }
            defpackage.abcu abcuVar2 = new defpackage.abcu(abcvVar);
            abcuVar2.d();
            return abcuVar2.a();
        }
        java.lang.String str = i == 2 ? (java.lang.String) zvuVar.c : "";
        if (android.text.TextUtils.isEmpty(str)) {
            android.util.Log.w("AppDoctorRestartUtil", "ProcessRestartFixConfig has no restart choice configured.");
            return abcvVar;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) abcvVar.b.getSystemService("activity");
        if (activityManager != null) {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                ahwtVarH = ahwt.a;
                break;
            }
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ahwtVarH = ahwt.a;
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                if (str.equals(next.processName)) {
                    ahwtVarH = ahyn.h(java.lang.Integer.valueOf(next.pid));
                    break;
                }
            }
        } else {
            android.util.Log.e("AppDoctorRestartUtil", "Failed to get ActivityManager.");
            ahwtVarH = ahwt.a;
        }
        if (!ahwtVarH.f()) {
            android.util.Log.d("AppDoctorRestartUtil", java.lang.String.format("Process '%s' is not currently running.", str));
            return abcvVar;
        }
        java.lang.Integer num = (java.lang.Integer) ahwtVarH.b();
        int iIntValue = num.intValue();
        android.util.Log.i("AppDoctorRestartUtil", java.lang.String.format("Killing '%s' pid=%d", str, num));
        if (iIntValue != android.os.Process.myPid()) {
            android.os.Process.killProcess(iIntValue);
            return abcvVar;
        }
        defpackage.abcu abcuVar3 = new defpackage.abcu(abcvVar);
        abcuVar3.d();
        return abcuVar3.a();
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "ProcessRestartFix";
    }
}
