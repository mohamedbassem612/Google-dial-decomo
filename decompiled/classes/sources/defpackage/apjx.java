package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjx {
    public static final java.util.TimeZone a;
    public static final java.lang.String b;

    static {
        java.util.TimeZone timeZone = j$.util.DesugarTimeZone.getTimeZone("GMT");
        defpackage.aooh.c(timeZone);
        a = timeZone;
        java.lang.String name = defpackage.apje.class.getName();
        defpackage.aooh.e(name, "getName(...)");
        b = defpackage.aoov.A(defpackage.aoov.z(name, "okhttp3."), "Client");
    }

    public static final long a(defpackage.apjm apjmVar) {
        java.lang.String strB = apjmVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        int i = defpackage.apjv.a;
        try {
            return java.lang.Long.parseLong(strB);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static final java.lang.Object b(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, defpackage.aonj aonjVar) {
        java.lang.Object obj2;
        do {
            obj2 = atomicReference.get();
            if (!((java.lang.Boolean) aonjVar.a(obj2)).booleanValue()) {
                break;
            }
        } while (!defpackage.anty.Q(atomicReference, obj2, obj));
        return obj2;
    }

    public static final java.lang.String c(java.lang.String str, java.lang.Object... objArr) {
        int length = objArr.length;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        defpackage.aooh.e(str2, "format(...)");
        return str2;
    }

    public static final java.lang.String d(defpackage.apiw apiwVar, boolean z) {
        java.lang.String str = apiwVar.b;
        if (defpackage.aoov.G(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z && apiwVar.c == defpackage.aooh.T(apiwVar.a)) {
            return str;
        }
        return str + ':' + apiwVar.c;
    }

    public static final java.util.List e(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            return defpackage.aokc.a;
        }
        if (list.size() == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(list.get(0));
            defpackage.aooh.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        java.lang.Object[] array = list.toArray();
        defpackage.aooh.e(array, "toArray(...)");
        if (array == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(array);
        defpackage.aooh.e(listAsList, "asList(...)");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(listAsList);
        defpackage.aooh.e(listUnmodifiableList, "unmodifiableList(...)");
        if (listUnmodifiableList != null) {
            return listUnmodifiableList;
        }
        defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return null;
    }

    public static final java.util.List f(java.lang.Object[] objArr) {
        int length;
        if (objArr == null || (length = objArr.length) == 0) {
            return defpackage.aokc.a;
        }
        if (length == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(objArr[0]);
            defpackage.aooh.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        if (objArr2 == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(objArr2);
        defpackage.aooh.e(listAsList, "asList(...)");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(listAsList);
        defpackage.aooh.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final defpackage.apiu g(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.zzx zzxVar = new defpackage.zzx((byte[]) null, (short[]) null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.apmg apmgVar = (defpackage.apmg) it.next();
            zzxVar.S(apmgVar.g.i(), apmgVar.h.i());
        }
        return defpackage.aoov.bl(zzxVar);
    }

    public static final void h(java.net.Socket socket) {
        defpackage.aooh.f(socket, "<this>");
        try {
            socket.close();
        } catch (java.lang.AssertionError e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            if (!defpackage.aooh.n(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean i(defpackage.apiw apiwVar, defpackage.apiw apiwVar2) {
        return defpackage.aooh.n(apiwVar.b, apiwVar2.b) && apiwVar.c == apiwVar2.c && defpackage.aooh.n(apiwVar.a, apiwVar2.a);
    }

    public static final boolean j(java.net.Socket socket, defpackage.appa appaVar) {
        defpackage.aooh.f(socket, "<this>");
        boolean z = true;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !appaVar.B();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (java.net.SocketTimeoutException unused) {
            return z;
        } catch (java.io.IOException unused2) {
            z = false;
            return z;
        }
    }

    public static final boolean k(defpackage.apqd apqdVar, int i, java.util.concurrent.TimeUnit timeUnit) {
        boolean z;
        defpackage.aooh.f(timeUnit, "timeUnit");
        long jNanoTime = java.lang.System.nanoTime();
        long j = apqdVar.fP().h() ? apqdVar.fP().j() - jNanoTime : Long.MAX_VALUE;
        apqdVar.fP().m(java.lang.Math.min(j, timeUnit.toNanos(i)) + jNanoTime);
        try {
            defpackage.apoy apoyVar = new defpackage.apoy();
            while (apqdVar.b(apoyVar, 8192L) != -1) {
                apoyVar.y();
            }
            z = true;
        } catch (java.io.InterruptedIOException unused) {
            z = false;
        } catch (java.lang.Throwable th) {
            defpackage.apqf apqfVarFP = apqdVar.fP();
            if (j == Long.MAX_VALUE) {
                apqfVarFP.k();
            } else {
                apqfVarFP.m(jNanoTime + j);
            }
            throw th;
        }
        if (j == Long.MAX_VALUE) {
            apqdVar.fP().k();
        } else {
            apqdVar.fP().m(jNanoTime + j);
        }
        return z;
    }

    public static final int l(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            defpackage.aooh.i("unit");
        }
        long j2 = 0;
        if (j < 0) {
            throw new java.lang.IllegalStateException("timeout < 0");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException("timeout too large");
        }
        if (millis != 0) {
            j2 = millis;
        } else if (j > 0) {
            throw new java.lang.IllegalArgumentException("timeout too small");
        }
        return (int) j2;
    }

    public static final boolean m(defpackage.apqd apqdVar, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(timeUnit, "timeUnit");
        try {
            return k(apqdVar, 100, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
