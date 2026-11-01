package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tja {
    public static final aimz a = aimz.i("com/android/dialer/searchfragment/enhancedsearch/SearchResultExpandedSheetPopulator");
    public final rlv b;
    public final nwu c;
    public tcp d = tcp.e;
    public boolean e;
    public final defpackage.rze f;
    private final ajct g;
    private final aoin h;
    private ajcq i;
    private final defpackage.rcr j;
    private final defpackage.rju k;

    public tja(defpackage.rcr rcrVar, defpackage.rze rzeVar, defpackage.rju rjuVar, rlv rlvVar, ajct ajctVar, aoin aoinVar, nwu nwuVar) {
        this.j = rcrVar;
        this.k = rjuVar;
        this.f = rzeVar;
        this.b = rlvVar;
        this.g = ajctVar;
        this.h = aoinVar;
        this.c = nwuVar;
    }

    private final rmw g() {
        return this.e ? rmw.jO : rmw.jN;
    }

    private final aify h() {
        return aify.p(this.e ? rmw.jK : rmw.jH);
    }

    private final void i(defpackage.tiz tizVar, defpackage.tit titVar, defpackage.tiu tiuVar) {
        titVar.a(tizVar.b, tizVar.a == defpackage.tiy.b ? new defpackage.sxq(this, 11) : null);
        tiuVar.a(tizVar.c);
    }

    private final void j(com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView, android.app.Activity activity, java.lang.String str) {
        e(dialerExpandedSheetView, null);
        ajcq ajcqVar = this.i;
        if (ajcqVar != null) {
            ajcqVar.cancel(true);
        }
        this.i = this.k.h(activity, str);
        a.b().l("com/android/dialer/searchfragment/enhancedsearch/SearchResultExpandedSheetPopulator", "updateOpenHistoryButton", 510, "SearchResultExpandedSheetPopulator.java").v("updating history button");
        ahvr.J(this.i, new defpackage.tix(this, activity, dialerExpandedSheetView), this.g);
    }

    public final void a(android.app.Activity activity, java.lang.String str, com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView) {
        this.b.n(g());
        j(dialerExpandedSheetView, activity, str);
        dialerExpandedSheetView.a();
    }

    public final void b() {
        this.b.n(this.e ? rmw.jQ : rmw.jP);
    }

    public final void c(android.app.Activity activity, com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton, final com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView, defpackage.tiv tivVar, wgi wgiVar) {
        final int i = 3;
        final int i2 = 1;
        final int i3 = 2;
        if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
            final defpackage.tkd tkdVar = tivVar.e;
            final java.lang.String str = tivVar.a;
            final int i4 = tivVar.b;
            final defpackage.abvz abvzVar = tivVar.c;
            final boolean z = wgiVar.c;
            primaryActionButton.a(new defpackage.tjh() { // from class: tjg
                @Override // defpackage.tjh
                public final void a() {
                    tkdVar.r(str, i4, abvzVar, z);
                }
            });
            primaryActionButton.b(snl.al(wgiVar));
            defpackage.tjq tjqVarC = this.j.c(activity, tkdVar, tivVar.d, str, i4, wgiVar.d, false);
            defpackage.tjh tjhVarK = this.f.k(new defpackage.tjd(activity, str, 1), h());
            if (this.d != tcp.d) {
                dialerExpandedSheetView.c(tjqVarC, new defpackage.sxq(this, 10));
                dialerExpandedSheetView.b(0, snl.ak(wgiVar, tjqVarC != null && tjqVarC.a == 2));
                dialerExpandedSheetView.e(tjhVarK, null);
                dialerExpandedSheetView.b(1, snl.am());
                dialerExpandedSheetView.f(null, null);
                dialerExpandedSheetView.b(2, snl.ai());
                dialerExpandedSheetView.g(2);
                return;
            }
            dialerExpandedSheetView.c(new defpackage.tjb(tkdVar, str, i4, abvzVar), null);
            dialerExpandedSheetView.b(0, snl.aj());
            dialerExpandedSheetView.e(tjqVarC, new defpackage.sxq(this, 9));
            dialerExpandedSheetView.b(1, snl.ak(wgiVar, tjqVarC != null && tjqVarC.a == 2));
            dialerExpandedSheetView.f(tjhVarK, null);
            dialerExpandedSheetView.b(2, snl.am());
            dialerExpandedSheetView.d(null, null);
            dialerExpandedSheetView.b(3, snl.ai());
            dialerExpandedSheetView.g(3);
            return;
        }
        final defpackage.tkd tkdVar2 = tivVar.e;
        final java.lang.String str2 = tivVar.a;
        final int i5 = tivVar.b;
        final defpackage.abvz abvzVar2 = tivVar.c;
        final boolean z2 = wgiVar.c;
        primaryActionButton.a(new defpackage.tjh() { // from class: tjg
            @Override // defpackage.tjh
            public final void a() {
                tkdVar2.r(str2, i5, abvzVar2, z2);
            }
        });
        primaryActionButton.b(snl.al(wgiVar));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.d == tcp.d) {
            arrayList.add(new defpackage.tiz(defpackage.tiy.a, new defpackage.tjb(tkdVar2, str2, i5, abvzVar2), snl.aj()));
        }
        defpackage.tjq tjqVarC2 = this.j.c(activity, tkdVar2, tivVar.d, str2, i5, wgiVar.d, dialerExpandedSheetView.a);
        if (tjqVarC2 != null) {
            arrayList.add(new defpackage.tiz(defpackage.tiy.b, tjqVarC2, snl.ak(wgiVar, tjqVarC2.a == 2)));
        }
        arrayList.add(new defpackage.tiz(defpackage.tiy.c, new defpackage.tjd(activity, str2, 1), snl.am()));
        arrayList.add(new defpackage.tiz(defpackage.tiy.d, null, snl.ai()));
        j$.util.List.-EL.sort(arrayList, j$.util.Comparator.-CC.comparing(new defpackage.thw(6)));
        int size = arrayList.size();
        if (size == 2) {
            dialerExpandedSheetView.g(1);
        } else if (size == 3) {
            dialerExpandedSheetView.g(2);
        } else {
            if (size != 4) {
                throw new java.lang.IllegalStateException("There should always be 2 or 3 or 4 actions for a default directory's expanded sheet.");
            }
            dialerExpandedSheetView.g(3);
        }
        if (size > 0) {
            defpackage.tiz tizVar = (defpackage.tiz) arrayList.get(0);
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            defpackage.tit titVar = new defpackage.tit() { // from class: tir
                @Override // defpackage.tit
                public final void a(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
                    int i6 = i2;
                    if (i6 == 0) {
                        dialerExpandedSheetView.e(tjhVar, runnable);
                        return;
                    }
                    if (i6 == 1) {
                        dialerExpandedSheetView.c(tjhVar, runnable);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i6 != 2) {
                        dialerExpandedSheetView2.d(tjhVar, runnable);
                    } else {
                        dialerExpandedSheetView2.f(tjhVar, runnable);
                    }
                }
            };
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            i(tizVar, titVar, new defpackage.tiu() { // from class: tis
                @Override // defpackage.tiu
                public final void a(defpackage.tjj tjjVar) {
                    int i6 = i2;
                    if (i6 == 0) {
                        dialerExpandedSheetView.b(1, tjjVar);
                        return;
                    }
                    if (i6 == 1) {
                        dialerExpandedSheetView.b(0, tjjVar);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i6 != 2) {
                        dialerExpandedSheetView2.b(3, tjjVar);
                    } else {
                        dialerExpandedSheetView2.b(2, tjjVar);
                    }
                }
            });
        }
        if (size >= 2) {
            defpackage.tiz tizVar2 = (defpackage.tiz) arrayList.get(1);
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            final int i6 = 0;
            defpackage.tit titVar2 = new defpackage.tit() { // from class: tir
                @Override // defpackage.tit
                public final void a(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
                    int i7 = i6;
                    if (i7 == 0) {
                        dialerExpandedSheetView.e(tjhVar, runnable);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.c(tjhVar, runnable);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.d(tjhVar, runnable);
                    } else {
                        dialerExpandedSheetView2.f(tjhVar, runnable);
                    }
                }
            };
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            i(tizVar2, titVar2, new defpackage.tiu() { // from class: tis
                @Override // defpackage.tiu
                public final void a(defpackage.tjj tjjVar) {
                    int i7 = i6;
                    if (i7 == 0) {
                        dialerExpandedSheetView.b(1, tjjVar);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.b(0, tjjVar);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.b(3, tjjVar);
                    } else {
                        dialerExpandedSheetView2.b(2, tjjVar);
                    }
                }
            });
        }
        if (size >= 3) {
            defpackage.tiz tizVar3 = (defpackage.tiz) arrayList.get(2);
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            defpackage.tit titVar3 = new defpackage.tit() { // from class: tir
                @Override // defpackage.tit
                public final void a(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
                    int i7 = i3;
                    if (i7 == 0) {
                        dialerExpandedSheetView.e(tjhVar, runnable);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.c(tjhVar, runnable);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.d(tjhVar, runnable);
                    } else {
                        dialerExpandedSheetView2.f(tjhVar, runnable);
                    }
                }
            };
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            i(tizVar3, titVar3, new defpackage.tiu() { // from class: tis
                @Override // defpackage.tiu
                public final void a(defpackage.tjj tjjVar) {
                    int i7 = i3;
                    if (i7 == 0) {
                        dialerExpandedSheetView.b(1, tjjVar);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.b(0, tjjVar);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.b(3, tjjVar);
                    } else {
                        dialerExpandedSheetView2.b(2, tjjVar);
                    }
                }
            });
        }
        if (size == 4) {
            defpackage.tiz tizVar4 = (defpackage.tiz) arrayList.get(3);
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            defpackage.tit titVar4 = new defpackage.tit() { // from class: tir
                @Override // defpackage.tit
                public final void a(defpackage.tjh tjhVar, java.lang.Runnable runnable) {
                    int i7 = i;
                    if (i7 == 0) {
                        dialerExpandedSheetView.e(tjhVar, runnable);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.c(tjhVar, runnable);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.d(tjhVar, runnable);
                    } else {
                        dialerExpandedSheetView2.f(tjhVar, runnable);
                    }
                }
            };
            j$.util.Objects.requireNonNull(dialerExpandedSheetView);
            i(tizVar4, titVar4, new defpackage.tiu() { // from class: tis
                @Override // defpackage.tiu
                public final void a(defpackage.tjj tjjVar) {
                    int i7 = i;
                    if (i7 == 0) {
                        dialerExpandedSheetView.b(1, tjjVar);
                        return;
                    }
                    if (i7 == 1) {
                        dialerExpandedSheetView.b(0, tjjVar);
                        return;
                    }
                    com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView2 = dialerExpandedSheetView;
                    if (i7 != 2) {
                        dialerExpandedSheetView2.b(3, tjjVar);
                    } else {
                        dialerExpandedSheetView2.b(2, tjjVar);
                    }
                }
            });
        }
    }

    public final void d(android.app.Activity activity, com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton, com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView, defpackage.tiw tiwVar, wgi wgiVar) {
        final defpackage.tkd tkdVar = tiwVar.f;
        final java.lang.String str = tiwVar.a;
        final int i = tiwVar.b;
        final defpackage.abvz abvzVar = tiwVar.c;
        final boolean z = wgiVar.c;
        final defpackage.rcr rcrVar = this.j;
        final boolean z2 = tiwVar.e;
        defpackage.tjh tjhVar = new defpackage.tjh() { // from class: tjc
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rlv] */
            @Override // defpackage.tjh
            public final void a() {
                if (z2) {
                    rcrVar.a.n(rmw.ld);
                }
                boolean z3 = z;
                defpackage.abvz abvzVar2 = abvzVar;
                int i2 = i;
                tkdVar.r(str, i2, abvzVar2, z3);
            }
        };
        primaryActionButton.b(snl.al(wgiVar));
        primaryActionButton.a(tjhVar);
        java.lang.String str2 = z2 ? "" : tiwVar.d;
        akzx akzxVarM = defpackage.uxq.a.m();
        akzxVarM.u();
        defpackage.uxq uxqVar = (defpackage.uxq) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        uxqVar.b |= 1;
        uxqVar.c = str;
        akzxVarM.u();
        defpackage.uxq uxqVar2 = (defpackage.uxq) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        uxqVar2.b |= 2;
        uxqVar2.d = str2;
        akzxVarM.u();
        defpackage.uxq uxqVar3 = (defpackage.uxq) akzxVarM.b;
        uxqVar3.b |= 4;
        uxqVar3.e = true;
        defpackage.tjd tjdVar = new defpackage.tjd(activity, (defpackage.uxq) akzxVarM.p(), 0);
        defpackage.rze rzeVar = this.f;
        defpackage.tjp tjpVarK = rzeVar.k(tjdVar, aify.p(this.e ? rmw.jL : rmw.jI));
        defpackage.tjp tjpVarK2 = rzeVar.k(new defpackage.tjd(activity, str, 1), h());
        if (this.d != tcp.d) {
            dialerExpandedSheetView.c(tjpVarK, null);
            dialerExpandedSheetView.b(0, snl.ah());
            dialerExpandedSheetView.e(tjpVarK2, null);
            dialerExpandedSheetView.b(1, snl.am());
            dialerExpandedSheetView.f(null, null);
            dialerExpandedSheetView.b(2, snl.ai());
            dialerExpandedSheetView.g(2);
            return;
        }
        dialerExpandedSheetView.c(new defpackage.tjb(tkdVar, str, i, abvzVar), null);
        dialerExpandedSheetView.b(0, snl.aj());
        dialerExpandedSheetView.e(tjpVarK, null);
        dialerExpandedSheetView.b(1, snl.ah());
        dialerExpandedSheetView.f(tjpVarK2, null);
        dialerExpandedSheetView.b(2, snl.am());
        dialerExpandedSheetView.d(null, null);
        dialerExpandedSheetView.b(3, snl.ai());
        dialerExpandedSheetView.g(3);
    }

    public final void e(com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView, defpackage.tjh tjhVar) {
        if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
            if (this.d == tcp.d) {
                dialerExpandedSheetView.d(tjhVar, null);
                return;
            } else {
                dialerExpandedSheetView.f(tjhVar, null);
                return;
            }
        }
        int i = dialerExpandedSheetView.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            dialerExpandedSheetView.e(tjhVar, null);
        } else if (i2 == 1) {
            dialerExpandedSheetView.f(tjhVar, null);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalArgumentException("Button display mode is unset");
            }
            dialerExpandedSheetView.d(tjhVar, null);
        }
    }

    public final void f(android.app.Activity activity, java.lang.String str, com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView) {
        this.b.n(g());
        j(dialerExpandedSheetView, activity, str);
        dialerExpandedSheetView.a();
    }
}
