package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epg extends defpackage.epc {
    public final defpackage.epf a;
    private final emx b;

    public epg(emx emxVar, eoh eohVar) {
        this.b = emxVar;
        this.a = (defpackage.epf) new eog(eohVar, defpackage.epf.a).a(defpackage.epf.class);
    }

    public static boolean g(int i) {
        return android.util.Log.isLoggable("LoaderManager", i);
    }

    private final void h(int i, defpackage.epb epbVar, defpackage.epl eplVar) {
        try {
            defpackage.epf epfVar = this.a;
            epfVar.c = true;
            defpackage.epl eplVarC = epbVar.c(i);
            if (eplVarC.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(eplVarC.getClass().getModifiers())) {
                throw new java.lang.IllegalArgumentException(a.bh(eplVarC, "Object returned from onCreateLoader must not be a non-static inner member class: "));
            }
            defpackage.epd epdVar = new defpackage.epd(i, eplVarC, eplVar);
            if (g(3)) {
                android.util.Log.d("LoaderManager", a.bh(epdVar, "  Created new loader "));
            }
            epfVar.b.f(i, epdVar);
            epfVar.b();
            epdVar.n(this.b, epbVar);
        } catch (java.lang.Throwable th) {
            this.a.b();
            throw th;
        }
    }

    @Override // defpackage.epc
    public final void b(int i) {
        defpackage.epf epfVar = this.a;
        if (epfVar.c) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (g(2)) {
            android.util.Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        defpackage.epd epdVarA = epfVar.a(i);
        if (epdVarA != null) {
            epdVarA.c(true);
            aed aedVar = epfVar.b;
            int iA = aei.a(aedVar.b, aedVar.d, i);
            if (iA >= 0) {
                java.lang.Object[] objArr = aedVar.c;
                java.lang.Object obj = objArr[iA];
                java.lang.Object obj2 = defpackage.aee.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    aedVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.epc
    @java.lang.Deprecated
    public final void c(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        aed aedVar = this.a.b;
        if (aedVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < aedVar.c(); i++) {
                java.lang.String strConcat = str.concat("    ");
                defpackage.epd epdVar = (defpackage.epd) aedVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aedVar.b(i));
                printWriter.print(": ");
                printWriter.println(epdVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(epdVar.g);
                printWriter.print(" mArgs=");
                printWriter.println((java.lang.Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                defpackage.epl eplVar = epdVar.h;
                printWriter.println(eplVar);
                eplVar.d(strConcat.concat("  "), fileDescriptor, printWriter, strArr);
                if (epdVar.i != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(epdVar.i);
                    defpackage.epe epeVar = epdVar.i;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(epeVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(defpackage.epl.q(epdVar.d()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(epdVar.l());
            }
        }
    }

    @Override // defpackage.epc
    public final boolean d() {
        defpackage.epe epeVar;
        aed aedVar = this.a.b;
        int iC = aedVar.c();
        for (int i = 0; i < iC; i++) {
            defpackage.epd epdVar = (defpackage.epd) aedVar.e(i);
            if (epdVar.l() && (epeVar = epdVar.i) != null && !epeVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.epc
    public final void e(int i, defpackage.epb epbVar) {
        defpackage.epf epfVar = this.a;
        if (epfVar.c) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        defpackage.epd epdVarA = epfVar.a(i);
        if (g(2)) {
            android.util.Log.v("LoaderManager", a.bi((java.lang.Object) null, this, "initLoader in ", ": args="));
        }
        if (epdVarA == null) {
            h(i, epbVar, null);
            return;
        }
        if (g(3)) {
            java.util.Objects.toString(epdVarA);
            android.util.Log.d("LoaderManager", "  Re-using existing loader ".concat(epdVarA.toString()));
        }
        epdVarA.n(this.b, epbVar);
    }

    @Override // defpackage.epc
    public final void f(int i, defpackage.epb epbVar) {
        defpackage.epf epfVar = this.a;
        if (epfVar.c) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("restartLoader must be called on the main thread");
        }
        if (g(2)) {
            android.util.Log.v("LoaderManager", a.bi((java.lang.Object) null, this, "restartLoader in ", ": args="));
        }
        defpackage.epd epdVarA = epfVar.a(i);
        h(i, epbVar, epdVarA != null ? epdVarA.c(false) : null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        emx emxVar = this.b;
        sb.append(emxVar.getClass().getSimpleName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(emxVar)));
        sb.append("}}");
        return sb.toString();
    }
}
