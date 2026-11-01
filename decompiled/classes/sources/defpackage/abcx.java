package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abcx implements defpackage.abcp {
    @Override // defpackage.abcp
    public final void a(zvk zvkVar) {
        java.lang.String string;
        defpackage.zvj zvjVar;
        int iAa = defpackage.a.aa(zvkVar.f);
        if ((iAa != 0 && iAa == 6 && android.util.Log.isLoggable("AppDoctorLogger", 6)) || android.util.Log.isLoggable("AppDoctorLogger", 4)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppDoctorEvent<");
            if ((zvkVar.b & 1) != 0) {
                sb.append("package_name='");
                sb.append(zvkVar.c);
                sb.append("' ");
            }
            if ((zvkVar.b & 2) != 0) {
                sb.append("process_name='");
                sb.append(zvkVar.d);
                sb.append("' ");
            }
            sb.append("fix='");
            zvl zvlVarB = zvl.b(zvkVar.e);
            if (zvlVarB == null) {
                zvlVarB = zvl.p;
            }
            sb.append(zvlVarB.a());
            sb.append("' status='");
            int iAa2 = defpackage.a.aa(zvkVar.f);
            if (iAa2 == 0) {
                iAa2 = 1;
            }
            int i = iAa2 - 2;
            if (i == 0) {
                string = "UNSPECIFIED";
            } else if (i == 1) {
                string = "PROPOSED";
            } else if (i == 2) {
                string = "COMPLETED";
            } else if (i == 3) {
                string = "SKIPPED";
            } else if (i != 4) {
                string = i != 5 ? java.lang.Integer.toString(defpackage.a.S(iAa2)) : "IN_PROGRESS";
            } else {
                string = "FAILED";
            }
            sb.append(string);
            sb.append("' entryPoint='");
            int i2 = zvkVar.g;
            if (i2 == 0) {
                zvjVar = defpackage.zvj.UNKNOWN;
            } else if (i2 != 1) {
                zvjVar = i2 != 2 ? null : defpackage.zvj.TELEDOCTOR;
            } else {
                zvjVar = defpackage.zvj.STARTUP;
            }
            if (zvjVar == null) {
                zvjVar = defpackage.zvj.UNRECOGNIZED;
            }
            sb.append(zvjVar.a());
            sb.append("'>");
            int iAa3 = defpackage.a.aa(zvkVar.f);
            if (iAa3 == 0 || iAa3 != 6) {
                android.util.Log.i("AppDoctorLogger", sb.toString());
            } else {
                android.util.Log.e("AppDoctorLogger", sb.toString());
            }
        }
    }
}
