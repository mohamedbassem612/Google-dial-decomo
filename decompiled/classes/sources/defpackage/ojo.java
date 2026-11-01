package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ojo {
    public static final /* synthetic */ int f = 0;
    private static final java.util.List g = defpackage.ajsz.bb("content://com.android.voicemail", "content://call_log");
    public final android.content.Context a;
    public final defpackage.zjm b;
    public final defpackage.zzx c;
    public final defpackage.aogc d;
    public final defpackage.aogc e;
    private final defpackage.aoin h;

    public ojo(android.content.Context context, defpackage.aogc aogcVar, defpackage.aogc aogcVar2, defpackage.zjm zjmVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("catchContentProviderException");
        }
        this.a = context;
        this.d = aogcVar;
        this.e = aogcVar2;
        this.b = zjmVar;
        this.c = zzxVar;
        this.h = aoinVar;
    }

    public final int a(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        return ((java.lang.Number) defpackage.zjm.i(this.b, zce.e, defpackage.ajsz.bb(defpackage.wsc.G(uri.getEncodedAuthority()), defpackage.wsc.G(uri.toString()), defpackage.wsc.G(str)), new ajx(this, uri, str, strArr, 6))).intValue();
    }

    public final android.database.Cursor b(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (uri == null) {
            defpackage.aooh.i("uri");
        }
        return this.a.getContentResolver().query(uri, strArr, str, strArr2, str2);
    }

    public final android.os.Bundle c(ojp ojpVar) {
        return this.a.getContentResolver().call(ojpVar.a, ojpVar.b, (java.lang.String) null, ojpVar.c);
    }

    public final defpackage.ajbg d(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (uri == null) {
            defpackage.aooh.i("uri");
        }
        return this.d.w(uri, strArr, str, strArr2, str2);
    }

    public final defpackage.ajcq e(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        zce zceVar = zce.e;
        defpackage.wsc[] wscVarArr = new defpackage.wsc[3];
        wscVarArr[0] = defpackage.wsc.G(uri.getEncodedAuthority());
        wscVarArr[1] = defpackage.wsc.G(j(uri));
        wscVarArr[2] = defpackage.wsc.G(str == null ? "" : str);
        return defpackage.zjm.j(this.b, zceVar, defpackage.ajsz.bb(wscVarArr), new ajx(this, uri, str, strArr, 5), null, 24);
    }

    public final defpackage.ajcq f(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        zce zceVar = zce.g;
        defpackage.wsc[] wscVarArr = new defpackage.wsc[4];
        wscVarArr[0] = defpackage.wsc.G(uri.getEncodedAuthority());
        wscVarArr[1] = defpackage.wsc.G(j(uri));
        wscVarArr[2] = defpackage.wsc.G(java.lang.Integer.valueOf(contentValues.size()));
        wscVarArr[3] = defpackage.wsc.G(str == null ? "" : str);
        return defpackage.zjm.j(this.b, zceVar, defpackage.ajsz.bb(wscVarArr), new dqu(this, uri, contentValues, str, strArr, 3), null, 24);
    }

    public final java.lang.Object g(android.net.Uri uri, android.content.ContentValues contentValues, defpackage.aoln aolnVar) {
        this.c.l(new defpackage.zcd(zce.f, defpackage.ajsz.bb(defpackage.wsc.G(uri.getEncodedAuthority()), defpackage.wsc.G(j(uri)), defpackage.wsc.G(new java.lang.Integer(contentValues.size()))), null, null, null, 28));
        return this.e.A(uri, contentValues, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aolr, java.lang.Object] */
    public final java.lang.Object h(android.net.Uri uri, java.lang.String[] strArr, android.os.Bundle bundle, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        ojn ojnVar;
        java.lang.Exception exc;
        java.lang.Object obj;
        java.lang.RuntimeException runtimeException;
        java.util.concurrent.CancellationException cancellationException;
        if (aolnVar instanceof ojn) {
            ojnVar = (ojn) aolnVar;
            int i = ojnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojnVar.d = i - Integer.MIN_VALUE;
            } else {
                ojnVar = new ojn(this, aolnVar);
            }
        } else {
            ojnVar = new ojn(this, aolnVar);
        }
        java.lang.Object obj2 = ojnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ojnVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = ojnVar.a;
            try {
                defpackage.aooc.af(obj2);
                return obj2;
            } catch (java.util.concurrent.CancellationException e) {
                cancellationException = e;
                if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
                    throw cancellationException;
                }
                aoil.b(cancellationException, (java.lang.Throwable) obj);
                throw cancellationException;
            } catch (java.lang.RuntimeException e2) {
                runtimeException = e2;
                aoil.b(runtimeException, (java.lang.Throwable) obj);
                throw runtimeException;
            } catch (java.lang.Exception e3) {
                exc = e3;
                if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                    throw exc;
                }
                aoil.b(exc, (java.lang.Throwable) obj);
                throw exc;
            }
        }
        defpackage.aooc.af(obj2);
        java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("Query failed: Original context stack trace:");
        try {
            defpackage.aogc aogcVar = this.e;
            ojnVar.a = runtimeException2;
            ojnVar.d = 1;
            java.lang.Object objBb = defpackage.agab.bb(aogcVar.c, new agtr(aogcVar, uri, strArr, bundle, aonjVar, 0), ojnVar);
            return objBb == aoluVar ? aoluVar : objBb;
        } catch (java.util.concurrent.CancellationException e4) {
            cancellationException = e4;
            obj = runtimeException2;
            if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
                throw cancellationException;
            }
            aoil.b(cancellationException, (java.lang.Throwable) obj);
            throw cancellationException;
        } catch (java.lang.RuntimeException e5) {
            runtimeException = e5;
            obj = runtimeException2;
            aoil.b(runtimeException, (java.lang.Throwable) obj);
            throw runtimeException;
        } catch (java.lang.Exception e6) {
            exc = e6;
            obj = runtimeException2;
            if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                throw exc;
            }
            aoil.b(exc, (java.lang.Throwable) obj);
            throw exc;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aolr, java.lang.Object] */
    public final java.lang.Object i(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        ojm ojmVar;
        java.lang.Object obj;
        java.lang.RuntimeException runtimeException;
        if (aolnVar instanceof ojm) {
            ojmVar = (ojm) aolnVar;
            int i = ojmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojmVar.d = i - Integer.MIN_VALUE;
            } else {
                ojmVar = new ojm(this, aolnVar);
            }
        } else {
            ojmVar = new ojm(this, aolnVar);
        }
        java.lang.Object obj2 = ojmVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ojmVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = ojmVar.a;
            try {
                defpackage.aooc.af(obj2);
                return obj2;
            } catch (java.util.concurrent.CancellationException e) {
                e = e;
                if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
                    aoil.b(e, (java.lang.Throwable) obj);
                }
                throw e;
            } catch (java.lang.RuntimeException e2) {
                runtimeException = e2;
                aoil.b(runtimeException, (java.lang.Throwable) obj);
                throw runtimeException;
            } catch (java.lang.Exception e3) {
                e = e3;
                if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                    aoil.b(e, (java.lang.Throwable) obj);
                }
                throw e;
            }
        }
        defpackage.aooc.af(obj2);
        java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("Query failed: Original context stack trace:");
        try {
            defpackage.aogc aogcVar = this.e;
            ojmVar.a = runtimeException2;
            ojmVar.d = 1;
            java.lang.Object objBb = defpackage.agab.bb(aogcVar.c, new agtq(aogcVar, uri, strArr, str, strArr2, str2, aonjVar), ojmVar);
            return objBb == aoluVar ? aoluVar : objBb;
        } catch (java.util.concurrent.CancellationException e4) {
            e = e4;
            obj = runtimeException2;
            if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
                aoil.b(e, (java.lang.Throwable) obj);
            }
            throw e;
        } catch (java.lang.RuntimeException e5) {
            runtimeException = e5;
            obj = runtimeException2;
            aoil.b(runtimeException, (java.lang.Throwable) obj);
            throw runtimeException;
        } catch (java.lang.Exception e6) {
            e = e6;
            obj = runtimeException2;
            if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                aoil.b(e, (java.lang.Throwable) obj);
            }
            throw e;
        }
    }

    public final java.lang.String j(android.net.Uri uri) {
        java.util.List<java.lang.String> list = g;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (java.lang.String str : list) {
                java.lang.String string = uri.toString();
                defpackage.aooh.e(string, "toString(...)");
                if (defpackage.aoov.ad(string, str)) {
                    java.lang.String string2 = uri.toString();
                    defpackage.aooh.c(string2);
                    return string2;
                }
            }
        }
        java.lang.String encodedAuthority = uri.getEncodedAuthority();
        return encodedAuthority == null ? "" : encodedAuthority;
    }

    public final defpackage.aoxh k(android.net.Uri uri) {
        if (uri == null) {
            defpackage.aooh.i("uri");
        }
        defpackage.aogc aogcVar = this.e;
        if (uri == null) {
            defpackage.aooh.i("uri");
        }
        return defpackage.aoov.aD(new defpackage.aoxa(new defpackage.jzw(aogcVar, uri, (defpackage.aoln) null, 4)), -1);
    }

    public final void l(android.net.Uri uri, boolean z, defpackage.agwz agwzVar) {
        defpackage.aooh.f(uri, "uri");
        defpackage.aooh.f(agwzVar, "observer");
        ((android.content.Context) this.d.a).getContentResolver().registerContentObserver(uri, z, agwzVar);
    }

    public final void m(defpackage.agwz agwzVar) {
        defpackage.aooh.f(agwzVar, "observer");
        ((android.content.Context) this.d.a).getContentResolver().unregisterContentObserver(agwzVar);
    }

    public final android.content.ContentProviderResult[] n(java.lang.String str, java.util.List list) {
        defpackage.aooh.f(list, "operations");
        return this.a.getContentResolver().applyBatch(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
    }

    public final java.lang.Object o(java.util.List list, defpackage.aoln aolnVar) {
        return this.e.z("call_log", list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList(list), aolnVar);
    }

    public final void p(android.net.Uri uri) {
        defpackage.aooh.f(uri, "uri");
        this.a.getContentResolver().notifyChange(uri, null);
    }

    public final void q(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        zce zceVar = zce.g;
        defpackage.wsc[] wscVarArr = new defpackage.wsc[4];
        wscVarArr[0] = defpackage.wsc.G(uri.getEncodedAuthority());
        wscVarArr[1] = defpackage.wsc.G(j(uri));
        wscVarArr[2] = defpackage.wsc.G(java.lang.Integer.valueOf(contentValues.size()));
        wscVarArr[3] = defpackage.wsc.G(str == null ? "" : str);
        ((java.lang.Number) defpackage.zjm.i(this.b, zceVar, defpackage.ajsz.bb(wscVarArr), new dqu(this, uri, contentValues, str, strArr, 4))).intValue();
    }

    public final void r(android.net.Uri uri, android.database.ContentObserver contentObserver) {
        if (uri == null) {
            defpackage.aooh.i("uri");
        }
        if (contentObserver == null) {
            defpackage.aooh.i("observer");
        }
        this.a.getContentResolver().registerContentObserver(uri, true, contentObserver);
    }
}
