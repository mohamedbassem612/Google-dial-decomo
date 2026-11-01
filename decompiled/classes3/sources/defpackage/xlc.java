package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xlc implements aoxi, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public xlc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xnx] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, xlw] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, xnx] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        aify aifyVarP;
        int i = this.$cid;
        if (i == 0) {
            this.a.a((defpackage.xoc) obj);
            return aojh.a;
        }
        final int i2 = 1;
        if (i == 1) {
            this.a.b((android.os.PersistableBundle) obj);
            return aojh.a;
        }
        final int i3 = 2;
        if (i == 2) {
            this.a.a((defpackage.xoc) obj);
            return aojh.a;
        }
        defpackage.afol afolVar = (defpackage.afol) obj;
        defpackage.afoe afoeVar = afolVar.a;
        if (!afoeVar.a() || !afolVar.b.a() || !afolVar.c.a()) {
            java.lang.Object obj2 = this.a;
            int i4 = afolVar.d;
            if (i4 == 0) {
                defpackage.afov afovVar = (defpackage.afov) obj2;
                aozj aozjVar = afovVar.i;
                aooh.f(afolVar, "resources");
                final int i5 = 0;
                if (afoeVar.a.isEmpty()) {
                    defpackage.afoe afoeVar2 = afolVar.b;
                    if (afoeVar2.a.isEmpty()) {
                        defpackage.afoe afoeVar3 = afolVar.c;
                        if (afoeVar3.a.isEmpty()) {
                            aifyVarP = aike.a;
                            aooh.c(aifyVarP);
                        } else {
                            final int i6 = 3;
                            aifyVarP = aify.p(afsq.j(afoeVar3, 39, new defpackage.afon() { // from class: afom
                                @Override // defpackage.afon
                                public final defpackage.afot a(java.util.List list) {
                                    int i7 = i6;
                                    if (i7 == 0) {
                                        aooh.f(list, "photos");
                                        return new defpackage.afos(list);
                                    }
                                    if (i7 == 1) {
                                        aooh.f(list, "photos");
                                        return new defpackage.afoq(list);
                                    }
                                    if (i7 != 2) {
                                        aooh.f(list, "photos");
                                        return new defpackage.afoq(list);
                                    }
                                    aooh.f(list, "photos");
                                    return new defpackage.afoq(list);
                                }
                            }));
                        }
                    } else {
                        aifyVarP = aify.q(afsq.i(afoeVar2), afsq.j(afolVar.c, 31, new defpackage.afon() { // from class: afom
                            @Override // defpackage.afon
                            public final defpackage.afot a(java.util.List list) {
                                int i7 = i2;
                                if (i7 == 0) {
                                    aooh.f(list, "photos");
                                    return new defpackage.afos(list);
                                }
                                if (i7 == 1) {
                                    aooh.f(list, "photos");
                                    return new defpackage.afoq(list);
                                }
                                if (i7 != 2) {
                                    aooh.f(list, "photos");
                                    return new defpackage.afoq(list);
                                }
                                aooh.f(list, "photos");
                                return new defpackage.afoq(list);
                            }
                        }));
                    }
                } else {
                    aifyVarP = aify.r(afsq.j(afoeVar, 7, new defpackage.afon() { // from class: afom
                        @Override // defpackage.afon
                        public final defpackage.afot a(java.util.List list) {
                            int i7 = i5;
                            if (i7 == 0) {
                                aooh.f(list, "photos");
                                return new defpackage.afos(list);
                            }
                            if (i7 == 1) {
                                aooh.f(list, "photos");
                                return new defpackage.afoq(list);
                            }
                            if (i7 != 2) {
                                aooh.f(list, "photos");
                                return new defpackage.afoq(list);
                            }
                            aooh.f(list, "photos");
                            return new defpackage.afoq(list);
                        }
                    }), afsq.i(afolVar.b), afsq.j(afolVar.c, 23, new defpackage.afon() { // from class: afom
                        @Override // defpackage.afon
                        public final defpackage.afot a(java.util.List list) {
                            int i7 = i3;
                            if (i7 == 0) {
                                aooh.f(list, "photos");
                                return new defpackage.afos(list);
                            }
                            if (i7 == 1) {
                                aooh.f(list, "photos");
                                return new defpackage.afoq(list);
                            }
                            if (i7 != 2) {
                                aooh.f(list, "photos");
                                return new defpackage.afoq(list);
                            }
                            aooh.f(list, "photos");
                            return new defpackage.afoq(list);
                        }
                    }));
                }
                aooh.f(aifyVarP, "results");
                aozjVar.e(new defpackage.afop(aifyVarP, 4, 0));
                afovVar.j = 4;
            } else {
                defpackage.afov afovVar2 = (defpackage.afov) obj2;
                afovVar2.i.e(new defpackage.afop(aokc.a, 5, i4));
                afovVar2.j = 5;
            }
        }
        return aojh.a;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof aoxi) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if (i == 1) {
            if ((obj instanceof aoxi) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if (i != 2) {
            if ((obj instanceof aoxi) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof aoxi) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        aonv aonvVar;
        int i = this.$cid;
        if (i == 0) {
            aonvVar = new aonv(2, this.a, defpackage.xnx.class, "onChange", "onChange(Lcom/android/onboarding/tasks/service/IPersistableBundleStream;)V", 4);
        } else {
            if (i != 1) {
                java.lang.Object obj = this.a;
                return i != 2 ? new aonv(2, obj, defpackage.afov.class, "onGooglePhotosReady", "onGooglePhotosReady(Lcom/google/android/libraries/user/profile/photopicker/components/googlephotos/viewmodel/GooglePhotosResource;)V", 4) : new aonv(2, obj, defpackage.xnx.class, "onChange", "onChange(Lcom/android/onboarding/tasks/service/IPersistableBundleStream;)V", 4);
            }
            aonvVar = new aonv(2, this.a, defpackage.xlw.class, "onTaskMetadataUpdated", "onTaskMetadataUpdated(Landroid/os/PersistableBundle;)V", 4);
        }
        return aonvVar;
    }

    public final int hashCode() {
        int i = this.$cid;
        if (i == 0) {
            return ex().hashCode();
        }
        if (i == 1) {
            return ex().hashCode();
        }
        aoio aoioVarEx = ex();
        return i != 2 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
