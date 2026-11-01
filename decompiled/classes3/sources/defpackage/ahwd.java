package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ahwd extends defpackage.ahvs {
    public static final j$.time.Duration b = j$.time.Duration.ofMinutes(3);
    public static final j$.time.Duration c = j$.time.Duration.ofMinutes(3).plusSeconds(45);
    public static final aigf d = aikj.b;
    private static final long serialVersionUID = 4556936364828217687L;
    public final java.lang.Object e;
    public volatile defpackage.ahwa f;
    public transient defpackage.ahwc g;

    public ahwd(defpackage.ahvu ahvuVar, j$.time.Duration duration, j$.time.Duration duration2) {
        this.e = new byte[0];
        this.f = null;
        if (ahvuVar != null) {
            this.f = defpackage.ahwa.a(ahvuVar, d);
        }
        ahvr.cj(duration, "refreshMargin");
        ahvr.bN(!duration.isNegative(), "refreshMargin can't be negative");
        ahvr.cj(duration2, "expirationMargin");
        ahvr.bN(!duration2.isNegative(), "expirationMargin can't be negative");
    }

    private final int b() {
        return this.f == null ? 3 : 1;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.g = null;
    }

    @Override // defpackage.ahvs
    public void a(java.util.concurrent.Executor executor, anyd anydVar) {
        defpackage.ahvy ahvyVar;
        ajcq ajcqVarY;
        if (b() == 1) {
            ajcqVarY = aiql.z(this.f);
        } else {
            java.lang.Object obj = this.e;
            synchronized (obj) {
                if (b() != 1) {
                    synchronized (obj) {
                        try {
                            defpackage.ahwc ahwcVar = this.g;
                            if (ahwcVar != null) {
                                ahvyVar = new defpackage.ahvy(ahwcVar, false);
                            } else {
                                ajcr ajcrVar = new ajcr(new defpackage.ahvx(this, 0));
                                this.g = new defpackage.ahwc(this, ajcrVar, new defpackage.xwr(this, ajcrVar, 4));
                                ahvyVar = new defpackage.ahvy(this.g, true);
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    ahvyVar = null;
                }
            }
            if (ahvyVar != null && ahvyVar.b) {
                executor.execute(ahvyVar.a);
            }
            synchronized (this.e) {
                if (b() != 3) {
                    ajcqVarY = aiql.z(this.f);
                } else {
                    ajcqVarY = ahvyVar != null ? ahvyVar.a : aiql.y(new java.lang.IllegalStateException("Credentials expired, but there is no task to refresh"));
                }
            }
        }
        aiql.I(ajcqVarY, new ahvz(anydVar), ajbm.a);
    }

    public defpackage.ahvu c() {
        throw new java.lang.IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahwd) {
            return j$.util.Objects.equals(this.f, ((defpackage.ahwd) obj).f);
        }
        return false;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.f);
    }

    public java.lang.String toString() {
        java.util.Map map;
        defpackage.ahvu ahvuVar;
        defpackage.ahwa ahwaVar = this.f;
        if (ahwaVar != null) {
            map = ahwaVar.b;
            ahvuVar = ahwaVar.a;
        } else {
            map = null;
            ahvuVar = null;
        }
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("requestMetadata", map);
        ahymVarL.b("temporaryAccess", ahvuVar);
        return ahymVarL.toString();
    }

    protected ahwd() {
        this(null, c, b);
    }
}
