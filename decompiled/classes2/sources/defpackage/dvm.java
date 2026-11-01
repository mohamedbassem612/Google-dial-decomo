package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvm {
    static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z) {
        return ac$.ExternalSyntheticApiModelOutline0.m(builder, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public static final defpackage.aaj b(defpackage.aaj aajVar) {
        if (android.text.TextUtils.isEmpty(aajVar.g)) {
            throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
        }
        if (aajVar.i != null) {
            return aajVar;
        }
        throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
    }

    public static final void c(java.util.Set set, defpackage.aaj aajVar) {
        acc accVar = new acc(0);
        accVar.addAll(set);
        aajVar.c = accVar;
    }

    public static final void d(androidx.core.graphics.drawable.IconCompat iconCompat, defpackage.aaj aajVar) {
        aajVar.f = iconCompat;
    }

    public static final void e(defpackage.aaj aajVar) {
        aajVar.a = true;
    }

    public static final void f(java.lang.CharSequence charSequence, defpackage.aaj aajVar) {
        aajVar.g = charSequence;
    }

    public static final void g(android.content.Intent intent, defpackage.aaj aajVar) {
        aajVar.i = new android.content.Intent[]{intent};
    }

    public static final void h(defpackage.dvv dvvVar, defpackage.aaj aajVar) {
        aajVar.h = new defpackage.dvv[]{dvvVar};
    }

    static java.lang.Object i(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Callable callable, int i) throws java.lang.InterruptedException {
        try {
            return executorService.submit(callable).get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.InterruptedException("timeout");
        }
    }

    public static android.graphics.Typeface j(android.content.Context context, java.util.List list, int i, boolean z, int i2, android.os.Handler handler, defpackage.dvl dvlVar) throws android.os.RemoteException {
        vx vxVar = new vx(dvlVar, new dxq(handler, 0));
        java.lang.Object obj = null;
        if (!z) {
            java.lang.String strA = defpackage.dxn.a(list, i);
            android.graphics.Typeface typeface = (android.graphics.Typeface) defpackage.dxn.a.a(strA);
            if (typeface != null) {
                vxVar.I(new amwp(typeface));
                obj = typeface;
            } else {
                defpackage.dxm dxmVar = new defpackage.dxm(vxVar, 1);
                synchronized (defpackage.dxn.c) {
                    aec aecVar = defpackage.dxn.d;
                    java.util.ArrayList arrayList = (java.util.ArrayList) aecVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(dxmVar);
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(dxmVar);
                        aecVar.put(strA, arrayList2);
                        defpackage.dxl dxlVar = new defpackage.dxl(strA, context, list, i);
                        defpackage.dxn.b.execute(new defpackage.dxr(android.os.Looper.myLooper() == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : new android.os.Handler(), dxlVar, new defpackage.dxm(strA, 0)));
                    }
                }
            }
        } else {
            if (list.size() > 1) {
                throw new java.lang.IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            dxj dxjVar = (dxj) list.get(0);
            add addVar = defpackage.dxn.a;
            java.lang.String strA2 = defpackage.dxn.a(vx.z(new java.lang.Object[]{dxjVar}), i);
            android.graphics.Typeface typeface2 = (android.graphics.Typeface) defpackage.dxn.a.a(strA2);
            if (typeface2 != null) {
                vxVar.I(new amwp(typeface2));
                obj = typeface2;
            } else if (i2 == -1) {
                amwp amwpVarB = defpackage.dxn.b(strA2, context, vx.z(new java.lang.Object[]{dxjVar}), i);
                vxVar.I(amwpVarB);
                obj = amwpVarB.b;
            } else {
                try {
                    amwp amwpVar = (amwp) i(defpackage.dxn.b, new defpackage.dxk(strA2, context, dxjVar, i), i2);
                    vxVar.I(amwpVar);
                    obj = amwpVar.b;
                } catch (java.lang.InterruptedException unused) {
                    vxVar.I(new amwp(-3, (byte[]) null));
                }
            }
        }
        return (android.graphics.Typeface) obj;
    }
}
