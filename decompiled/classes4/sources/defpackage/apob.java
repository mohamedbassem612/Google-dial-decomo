package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apob extends apod {
    private final defpackage.apoc a;

    public apob(defpackage.apoc apocVar) {
        this.a = apocVar;
    }

    private static final boolean b(java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2, int i) {
        if (!aooh.n(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public final java.util.List a(java.util.List list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        java.security.cert.X509Certificate x509Certificate;
        aooh.f(list, "chain");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object objRemoveFirst = arrayDeque.removeFirst();
        aooh.e(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            java.lang.Object obj = arrayList.get(arrayList.size() - 1);
            aooh.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) obj;
            defpackage.apoc apocVar = this.a;
            aooh.f(x509Certificate2, "cert");
            java.util.Set set = (java.util.Set) apocVar.a.get(x509Certificate2.getIssuerX500Principal());
            java.security.cert.X509Certificate x509Certificate3 = null;
            java.lang.Object obj2 = null;
            if (set != null) {
                for (java.lang.Object obj3 : set) {
                    try {
                        x509Certificate2.verify(((java.security.cert.X509Certificate) obj3).getPublicKey());
                        obj2 = obj3;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                x509Certificate3 = (java.security.cert.X509Certificate) obj2;
            }
            if (x509Certificate3 != null) {
                if (arrayList.size() > 1 || !aooh.n(x509Certificate2, x509Certificate3)) {
                    arrayList.add(x509Certificate3);
                }
                if (b(x509Certificate3, x509Certificate3, arrayList.size() - 2)) {
                    return arrayList;
                }
                z = true;
                i++;
                z = z;
            } else {
                java.util.Iterator it = arrayDeque.iterator();
                aooh.e(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            java.util.Objects.toString(x509Certificate2);
                            throw new javax.net.ssl.SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(java.lang.String.valueOf(x509Certificate2)));
                        }
                        return arrayList;
                    }
                    java.lang.Object next = it.next();
                    aooh.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (java.security.cert.X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
                i++;
                z = z;
            }
        }
        arrayList.toString();
        throw new javax.net.ssl.SSLPeerUnverifiedException("Certificate chain too long: ".concat(arrayList.toString()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.apob) && aooh.n(((defpackage.apob) obj).a, this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
