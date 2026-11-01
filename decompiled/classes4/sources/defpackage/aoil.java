package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoil {
    public static final java.lang.String a(java.lang.Throwable th) {
        aooh.f(th, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String string = stringWriter.toString();
        aooh.e(string, "toString(...)");
        return string;
    }

    public static final void b(java.lang.Throwable th, java.lang.Throwable th2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        aooh.f(th, "<this>");
        aooh.f(th2, "exception");
        if (th != th2) {
            aooh.f(th, "cause");
            aooh.f(th2, "exception");
            if (aomn.c()) {
                th.addSuppressed(th2);
                return;
            }
            aooh.f(th, "cause");
            aooh.f(th2, "exception");
            java.lang.reflect.Method method = defpackage.aoml.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void c(defpackage.anpk anpkVar, defpackage.aohy aohyVar) {
        aohyVar.f(new defpackage.anqz(anqw.j.f(java.lang.String.format("Method %s is unimplemented", anpkVar.b)), null));
    }

    public static final defpackage.apcv d(aonj aonjVar, java.lang.Object obj, defpackage.apcv apcvVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        try {
            aonjVar.a(obj);
            return apcvVar;
        } catch (java.lang.Throwable th) {
            if (apcvVar == null || apcvVar.getCause() == th) {
                java.util.Objects.toString(obj);
                return new defpackage.apcv("Exception in undelivered element handler for ".concat(java.lang.String.valueOf(obj)), th);
            }
            b(apcvVar, th);
            return apcvVar;
        }
    }

    public static final void e(aonj aonjVar, java.lang.Object obj, aolr aolrVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        defpackage.apcv apcvVarD = d(aonjVar, obj, null);
        if (apcvVarD != null) {
            aosv.t(aolrVar, apcvVarD);
        }
    }

    public static final void f(aolr aolrVar, java.lang.Throwable th) {
        java.util.Iterator it = defpackage.apbk.a.iterator();
        while (it.hasNext()) {
            try {
                ((kotlinx.coroutines.CoroutineExceptionHandler) it.next()).handleException(aolrVar, th);
            } catch (defpackage.apbp unused) {
                return;
            } catch (java.lang.Throwable th2) {
                defpackage.apbk.a(aosv.s(th, th2));
            }
        }
        try {
            b(th, new defpackage.apbm(aolrVar));
        } catch (java.lang.Throwable unused2) {
        }
        defpackage.apbk.a(th);
    }

    public static /* synthetic */ int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final java.lang.Object h(aowv aowvVar, java.lang.Object obj) {
        java.lang.Object objB = aowvVar.b(obj);
        if (objB instanceof aowl) {
            return ((aowm) aoov.ai(new pzf(aowvVar, obj, (aoln) null, 10))).b;
        }
        return aojh.a;
    }

    public static void i(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static java.lang.String j(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new java.lang.IllegalArgumentException(a.bj(i, "Unknown state "));
        }
    }

    public static java.lang.Object k(defpackage.apvm apvmVar, java.lang.Class cls) throws java.lang.Exception {
        try {
            return apvmVar.a();
        } catch (java.lang.Exception e) {
            if (defpackage.aabo$$ExternalSyntheticApiModelOutline0.m$4(e)) {
                org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (defpackage.aabo$$ExternalSyntheticApiModelOutline0.m43m((java.lang.Object) e)) {
                throw l(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static org.chromium.net.CronetException l(java.lang.Exception exc) {
        if (!defpackage.aabo$$ExternalSyntheticApiModelOutline0.m43m((java.lang.Object) exc)) {
            throw new java.lang.IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (defpackage.aabo$$ExternalSyntheticApiModelOutline0.m$1(exc)) {
            return new defpackage.apuw(defpackage.aabo$$ExternalSyntheticApiModelOutline0.m34m((java.lang.Object) exc));
        }
        if (defpackage.aabo$$ExternalSyntheticApiModelOutline0.m$2(exc)) {
            return new defpackage.apuv(defpackage.aabo$$ExternalSyntheticApiModelOutline0.m33m((java.lang.Object) exc), false);
        }
        return defpackage.aabo$$ExternalSyntheticApiModelOutline0.m$3(exc) ? new defpackage.apuq(defpackage.aabo$$ExternalSyntheticApiModelOutline0.m31m((java.lang.Object) exc)) : new defpackage.apuu(defpackage.aabo$$ExternalSyntheticApiModelOutline0.m32m((java.lang.Object) exc));
    }

    public static org.chromium.net.UploadDataProvider m(byte[] bArr, int i, int i2) {
        return new defpackage.apuf(java.nio.ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static org.json.JSONObject n(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (org.json.JSONException e) {
                throw new java.lang.IllegalArgumentException(a.bp((byte) 93, str, "Failed adding a default object for key ["), e);
            }
        }
        return jSONObjectOptJSONObject;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public static final void o(java.lang.String str, java.lang.String str2, vqf vqfVar) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(cCharAt), java.lang.Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header value: %s", java.lang.Integer.valueOf(cCharAt2), java.lang.Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            ?? r1 = vqfVar.a;
            if (i >= r1.size()) {
                r1.add(str);
                r1.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((java.lang.String) r1.get(i))) {
                    r1.remove(i);
                    r1.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public static uzx p(android.content.Context context) {
        boolean z = false;
        try {
            java.lang.Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, defpackage.apvu.class.getClassLoader());
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        return defpackage.apum.a(context, true, defpackage.apvu.a(context).getBoolean("android.net.http.EnableTelemetry", !z));
    }
}
