package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vra extends defpackage.vqs implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.vrh c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.vrh vrhVarY = y();
            defpackage.vrb vrbVar = vrhVarY.d;
            vrhVarY.j = new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(vrbVar.b), vrbVar.c);
            ajwr ajwrVar = vrhVarY.t;
            defpackage.vrl vrlVar = vrhVarY.h;
            ajwrVar.n(new agxo(vrlVar.g, new defpackage.vrk(vrlVar, vrhVarY.j, 0), defpackage.vrl.a), vrhVarY.o);
            android.view.View viewInflate = layoutInflater.inflate(2131624701, viewGroup, false);
            if (((java.lang.Boolean) vrhVarY.i.a()).booleanValue()) {
                url.a(viewInflate, 527);
            } else {
                url.a(viewInflate, 519);
            }
            if (viewInflate == null) {
                throw new java.lang.IllegalStateException("Fragments without views cannot use Android event listeners such as @OnClick, @OnCheckedChange, @OnLongClick, etc.");
            }
            ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.vqs
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        int i;
        this.b.j();
        try {
            ajwr ajwrVarX = ahvr.x(this);
            ajwrVarX.a = view;
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131428581), new defpackage.szl(y(), 17));
            ahvr.e(this, defpackage.vqx.class, new defpackage.uzb(y(), 5));
            aooh.f(view, "view");
            defpackage.vrh vrhVarY = y();
            if (bundle != null) {
                if (bundle.getString("UI_STATE") != null) {
                    java.lang.String string = bundle.getString("UI_STATE");
                    switch (string.hashCode()) {
                        case -140685393:
                            if (string.equals("ENTER_NEW_PIN")) {
                                i = 3;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException();
                        case 929675446:
                            if (string.equals("ENTER_OLD_PIN")) {
                                i = 2;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException();
                        case 1401079419:
                            if (string.equals("UNINITIALIZED")) {
                                i = 1;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException();
                        case 1897548695:
                            if (string.equals("CONFIRM_NEW_PIN")) {
                                i = 4;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException();
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
                    vrhVarY.r = i;
                }
                if (bundle.getString("OLD_PIN") != null) {
                    vrhVarY.k = bundle.getString("OLD_PIN");
                }
                if (bundle.getString("FIRST_PIN") != null) {
                    vrhVarY.l = bundle.getString("FIRST_PIN");
                }
            }
            if (vrhVarY.r == 0) {
                vrhVarY.r = 1;
                view.setVisibility(4);
                vrhVarY.g();
            }
            vrhVarY.s.g(view.findViewById(2131427738), new defpackage.vrg());
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ahgi(this, layoutInflaterCloneInContext));
            ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.vqs
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                vri vriVar = (vri) agab.aC(this, vri.class);
                ahoq ahoqVarY = ahvr.Y(1007, defpackage.vra.class, "CreatePeer");
                try {
                    this.c = vriVar.cH();
                    ahoqVarY.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.vrh vrhVarY = y();
            agtj agtjVar = vrhVarY.f;
            agtjVar.h(vrhVarY.p);
            agtjVar.h(vrhVarY.q);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (((aw) this).Q == null) {
                this.ak.l();
            }
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j() {
        ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.e = true;
            ahpmVarD.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarD.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(android.os.Bundle bundle) {
        java.lang.String str;
        this.b.j();
        try {
            defpackage.vrh vrhVarY = y();
            int i = vrhVarY.r;
            if (i == 1) {
                str = "UNINITIALIZED";
            } else if (i == 2) {
                str = "ENTER_OLD_PIN";
            } else if (i != 3) {
                str = i != 4 ? "null" : "CONFIRM_NEW_PIN";
            } else {
                str = "ENTER_NEW_PIN";
            }
            if (i == 0) {
                throw null;
            }
            bundle.putString("UI_STATE", str);
            bundle.putString("OLD_PIN", vrhVarY.k);
            bundle.putString("FIRST_PIN", vrhVarY.l);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vqs
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.vrh y() {
        defpackage.vrh vrhVar = this.c;
        if (vrhVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return vrhVar;
    }

    @Override // defpackage.vqs
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
