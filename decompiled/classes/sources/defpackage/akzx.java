package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class akzx extends defpackage.akyl implements defpackage.albi, nsr, obg, pdx, spo, abxq, abxu, alwa, alwo, amjo, amjq {
    public final defpackage.alad a;
    public defpackage.alad b;

    public akzx(defpackage.alad aladVar) {
        this.a = aladVar;
        if (aladVar.U()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = bR();
    }

    private final defpackage.alad bR() {
        return this.a.s();
    }

    public final void A(byte[] bArr, int i, defpackage.akzq akzqVar) throws defpackage.alaz {
        u();
        try {
            defpackage.albp.a.a(this.b).j(this.b, bArr, 0, i, new defpackage.akyq(akzqVar));
        } catch (defpackage.alaz e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void B(java.lang.Iterable iterable) {
        u();
        jvm jvmVar = this.b;
        jvm jvmVar2 = jvm.a;
        defpackage.alat alatVar = jvmVar.e;
        if (!alatVar.c()) {
            jvmVar.e = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, jvmVar.e);
    }

    public final void C(jvw jvwVar) {
        u();
        jvx jvxVar = this.b;
        defpackage.alal alalVar = jvx.a;
        j$.util.Objects.requireNonNull(jvwVar);
        defpackage.alak alakVar = jvxVar.c;
        if (!alakVar.c()) {
            jvxVar.c = defpackage.alad.H(alakVar);
        }
        jvxVar.c.g(jvwVar.g);
    }

    public final void D(kip kipVar) {
        u();
        kiq kiqVar = this.b;
        kiq kiqVar2 = kiq.a;
        j$.util.Objects.requireNonNull(kipVar);
        kiqVar.b();
        kiqVar.b.add(kipVar);
    }

    @java.lang.Deprecated
    public final void E(java.lang.String str) {
        u();
        kis kisVar = this.b;
        kis kisVar2 = kis.a;
        j$.util.Objects.requireNonNull(str);
        kisVar.b();
        kisVar.c.add(str);
    }

    public final void F(long j) {
        u();
        kis kisVar = this.b;
        kis kisVar2 = kis.a;
        kisVar.c();
        kisVar.b.g(j);
    }

    public final void G(long j) {
        u();
        kis kisVar = this.b;
        kis kisVar2 = kis.a;
        kisVar.d();
        kisVar.d.g(j);
    }

    public final void H(java.lang.Iterable iterable) {
        u();
        defpackage.kvi kviVar = (defpackage.kvi) this.b;
        defpackage.kvi kviVar2 = defpackage.kvi.a;
        defpackage.alat alatVar = kviVar.d;
        if (!alatVar.c()) {
            kviVar.d = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, kviVar.d);
    }

    public final void I(lgo lgoVar) {
        u();
        lgp lgpVar = this.b;
        lgp lgpVar2 = lgp.a;
        j$.util.Objects.requireNonNull(lgoVar);
        defpackage.alat alatVar = lgpVar.b;
        if (!alatVar.c()) {
            lgpVar.b = defpackage.alad.J(alatVar);
        }
        lgpVar.b.add(lgoVar);
    }

    public final void J(ampc ampcVar) {
        u();
        lld lldVar = this.b;
        defpackage.alal alalVar = lld.a;
        j$.util.Objects.requireNonNull(ampcVar);
        defpackage.alak alakVar = lldVar.f;
        if (!alakVar.c()) {
            lldVar.f = defpackage.alad.H(alakVar);
        }
        lldVar.f.g(ampcVar.e);
    }

    public final void K(java.lang.Iterable iterable) {
        u();
        defpackage.mha mhaVar = (defpackage.mha) this.b;
        defpackage.mha mhaVar2 = defpackage.mha.a;
        mhaVar.b();
        defpackage.akyl.i(iterable, mhaVar.b);
    }

    public final void L(java.lang.Iterable iterable) {
        u();
        mit mitVar = this.b;
        mit mitVar2 = mit.a;
        defpackage.alat alatVar = mitVar.c;
        if (!alatVar.c()) {
            mitVar.c = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, mitVar.c);
    }

    public final void M(java.lang.Iterable iterable) {
        u();
        defpackage.olw olwVar = (defpackage.olw) this.b;
        defpackage.olw olwVar2 = defpackage.olw.a;
        defpackage.alat alatVar = olwVar.b;
        if (!alatVar.c()) {
            olwVar.b = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, olwVar.b);
    }

    public final void N(java.lang.String str) {
        u();
        sox soxVar = this.b;
        sox soxVar2 = sox.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = soxVar.b;
        if (!alatVar.c()) {
            soxVar.b = defpackage.alad.J(alatVar);
        }
        soxVar.b.add(str);
    }

    public final void O(java.lang.Iterable iterable) {
        u();
        spe speVar = this.b;
        spe speVar2 = spe.a;
        speVar.b();
        defpackage.akyl.i(iterable, speVar.b);
    }

    public final void P(spd spdVar) {
        u();
        spe speVar = this.b;
        spe speVar2 = spe.a;
        j$.util.Objects.requireNonNull(spdVar);
        speVar.b();
        speVar.b.add(spdVar);
    }

    public final void Q(java.lang.Iterable iterable) {
        u();
        upt uptVar = this.b;
        upt uptVar2 = upt.a;
        defpackage.alat alatVar = uptVar.l;
        if (!alatVar.c()) {
            uptVar.l = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, uptVar.l);
    }

    public final void R(int i, urx urxVar) {
        j$.util.Objects.requireNonNull(urxVar);
        u();
        ury uryVar = this.b;
        ury uryVar2 = ury.a;
        defpackage.albe albeVar = uryVar.d;
        if (!albeVar.b) {
            uryVar.d = albeVar.a();
        }
        uryVar.d.put(java.lang.Integer.valueOf(i), urxVar);
    }

    public final void S(int i, urw urwVar) {
        j$.util.Objects.requireNonNull(urwVar);
        u();
        urx urxVar = this.b;
        urx urxVar2 = urx.a;
        defpackage.albe albeVar = urxVar.b;
        if (!albeVar.b) {
            urxVar.b = albeVar.a();
        }
        urxVar.b.put(java.lang.Integer.valueOf(i), urwVar);
    }

    public final void T(java.lang.Iterable iterable) {
        u();
        uts utsVar = this.b;
        uts utsVar2 = uts.a;
        utsVar.b();
        defpackage.akyl.i(iterable, utsVar.b);
    }

    public final void U(utw utwVar) {
        u();
        uts utsVar = this.b;
        uts utsVar2 = uts.a;
        j$.util.Objects.requireNonNull(utwVar);
        utsVar.b();
        utsVar.b.add(utwVar);
    }

    public final void V(java.lang.String str) {
        u();
        defpackage.vbu vbuVar = (defpackage.vbu) this.b;
        defpackage.vbu vbuVar2 = defpackage.vbu.a;
        j$.util.Objects.requireNonNull(str);
        vbuVar.b();
        vbuVar.g.add(str);
    }

    public final void W(java.lang.String str) {
        u();
        defpackage.vbu vbuVar = (defpackage.vbu) this.b;
        defpackage.vbu vbuVar2 = defpackage.vbu.a;
        j$.util.Objects.requireNonNull(str);
        vbuVar.c();
        vbuVar.f.add(str);
    }

    public final void X(java.lang.String str) {
        u();
        defpackage.vbu vbuVar = (defpackage.vbu) this.b;
        defpackage.vbu vbuVar2 = defpackage.vbu.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = vbuVar.y;
        if (!alatVar.c()) {
            vbuVar.y = defpackage.alad.J(alatVar);
        }
        vbuVar.y.add(str);
    }

    public final void Y(java.lang.Iterable iterable) {
        u();
        defpackage.vml vmlVar = (defpackage.vml) this.b;
        defpackage.vml vmlVar2 = defpackage.vml.a;
        vmlVar.b();
        defpackage.akyl.i(iterable, vmlVar.b);
    }

    public final void Z(vtf vtfVar) {
        u();
        defpackage.vtg vtgVar = (defpackage.vtg) this.b;
        defpackage.vtg vtgVar2 = defpackage.vtg.a;
        j$.util.Objects.requireNonNull(vtfVar);
        vtgVar.b();
        vtgVar.b.add(vtfVar);
    }

    public final void aA(defpackage.akzx akzxVar) {
        u();
        aenz aenzVar = this.b;
        aenv aenvVarR = akzxVar.r();
        aenz aenzVar2 = aenz.a;
        j$.util.Objects.requireNonNull(aenvVarR);
        aenzVar.b();
        aenzVar.e.add(aenvVarR);
    }

    public final void aB(defpackage.akzx akzxVar) {
        u();
        aenx aenxVar = this.b;
        defpackage.apgw apgwVar = (defpackage.apgw) akzxVar.r();
        aenx aenxVar2 = aenx.a;
        j$.util.Objects.requireNonNull(apgwVar);
        defpackage.alat alatVar = aenxVar.c;
        if (!alatVar.c()) {
            aenxVar.c = defpackage.alad.J(alatVar);
        }
        aenxVar.c.add(apgwVar);
    }

    public final void aC(defpackage.akzx akzxVar) {
        u();
        akhp akhpVar = this.b;
        akho akhoVarR = akzxVar.r();
        akhp akhpVar2 = akhp.a;
        j$.util.Objects.requireNonNull(akhoVarR);
        defpackage.alat alatVar = akhpVar.c;
        if (!alatVar.c()) {
            akhpVar.c = defpackage.alad.J(alatVar);
        }
        akhpVar.c.add(akhoVarR);
    }

    public final void aD(defpackage.akzx akzxVar) {
        u();
        akiy akiyVar = this.b;
        akiu akiuVarR = akzxVar.r();
        akiy akiyVar2 = akiy.a;
        j$.util.Objects.requireNonNull(akiuVarR);
        defpackage.alat alatVar = akiyVar.c;
        if (!alatVar.c()) {
            akiyVar.c = defpackage.alad.J(alatVar);
        }
        akiyVar.c.add(akiuVarR);
    }

    public final void aE(defpackage.akzx akzxVar) {
        u();
        akjc akjcVar = this.b;
        akkd akkdVarR = akzxVar.r();
        akjc akjcVar2 = akjc.a;
        j$.util.Objects.requireNonNull(akkdVarR);
        defpackage.alat alatVar = akjcVar.h;
        if (!alatVar.c()) {
            akjcVar.h = defpackage.alad.J(alatVar);
        }
        akjcVar.h.add(akkdVarR);
    }

    public final void aF(defpackage.akzx akzxVar) {
        u();
        akjh akjhVar = this.b;
        akkd akkdVarR = akzxVar.r();
        akjh akjhVar2 = akjh.a;
        j$.util.Objects.requireNonNull(akkdVarR);
        defpackage.alat alatVar = akjhVar.j;
        if (!alatVar.c()) {
            akjhVar.j = defpackage.alad.J(alatVar);
        }
        akjhVar.j.add(akkdVarR);
    }

    public final void aG(defpackage.akzx akzxVar) {
        u();
        akkh akkhVar = this.b;
        akkd akkdVarR = akzxVar.r();
        akkh akkhVar2 = akkh.a;
        j$.util.Objects.requireNonNull(akkdVarR);
        akkhVar.b();
        akkhVar.j.add(akkdVarR);
    }

    public final void aH(defpackage.akzx akzxVar) {
        u();
        akkj akkjVar = this.b;
        akjm akjmVarR = akzxVar.r();
        akkj akkjVar2 = akkj.a;
        j$.util.Objects.requireNonNull(akjmVarR);
        defpackage.alat alatVar = akkjVar.f;
        if (!alatVar.c()) {
            akkjVar.f = defpackage.alad.J(alatVar);
        }
        akkjVar.f.add(akjmVarR);
    }

    public final void aI(java.lang.Iterable iterable) {
        u();
        defpackage.aktb aktbVar = (defpackage.aktb) this.b;
        defpackage.aktb aktbVar2 = defpackage.aktb.a;
        aktbVar.b();
        defpackage.akyl.i(iterable, aktbVar.b);
    }

    public final void aJ(java.lang.Iterable iterable) {
        u();
        alfr alfrVar = this.b;
        alfr alfrVar2 = alfr.a;
        defpackage.alak alakVar = alfrVar.k;
        if (!alakVar.c()) {
            alfrVar.k = defpackage.alad.H(alakVar);
        }
        defpackage.akyl.i(iterable, alfrVar.k);
    }

    public final void aK(algu alguVar) {
        u();
        algv algvVar = this.b;
        algv algvVar2 = algv.a;
        j$.util.Objects.requireNonNull(alguVar);
        defpackage.alak alakVar = algvVar.d;
        if (!alakVar.c()) {
            algvVar.d = defpackage.alad.H(alakVar);
        }
        algvVar.d.g(alguVar.a());
    }

    public final void aL(java.lang.Iterable iterable) {
        u();
        alob alobVar = this.b;
        alob alobVar2 = alob.a;
        defpackage.alat alatVar = alobVar.b;
        if (!alatVar.c()) {
            alobVar.b = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, alobVar.b);
    }

    public final void aM(alnr alnrVar) {
        u();
        alon alonVar = this.b;
        alon alonVar2 = alon.a;
        j$.util.Objects.requireNonNull(alnrVar);
        defpackage.alat alatVar = alonVar.b;
        if (!alatVar.c()) {
            alonVar.b = defpackage.alad.J(alatVar);
        }
        alonVar.b.add(alnrVar);
    }

    public final void aN(java.lang.Iterable iterable) {
        u();
        alqp alqpVar = this.b;
        alqp alqpVar2 = alqp.a;
        defpackage.alat alatVar = alqpVar.b;
        if (!alatVar.c()) {
            alqpVar.b = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, alqpVar.b);
    }

    public final void aO(java.lang.Iterable iterable) {
        u();
        alrc alrcVar = this.b;
        alrc alrcVar2 = alrc.a;
        defpackage.alat alatVar = alrcVar.e;
        if (!alatVar.c()) {
            alrcVar.e = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, alrcVar.e);
    }

    public final void aP(java.util.Map map) {
        u();
        alri alriVar = this.b;
        alri alriVar2 = alri.a;
        alriVar.b().putAll(map);
    }

    public final void aQ(java.util.Map map) {
        u();
        alri alriVar = this.b;
        alri alriVar2 = alri.a;
        alriVar.c().putAll(map);
    }

    public final void aR(java.lang.Iterable iterable) {
        u();
        alwf alwfVar = this.b;
        alwf alwfVar2 = alwf.a;
        alwfVar.b();
        defpackage.akyl.i(iterable, alwfVar.d);
    }

    public final void aS(java.lang.Iterable iterable) {
        u();
        alwg alwgVar = this.b;
        alwg alwgVar2 = alwg.a;
        defpackage.alag alagVar = alwgVar.b;
        if (!alagVar.c()) {
            alwgVar.b = defpackage.alad.F(alagVar);
        }
        defpackage.akyl.i(iterable, alwgVar.b);
    }

    public final alxe aT() {
        alxe alxeVar = this.b.i;
        return alxeVar == null ? alxe.a : alxeVar;
    }

    public final boolean aU() {
        return (this.b.b & 256) != 0;
    }

    public final void aV(java.lang.Iterable iterable) {
        u();
        alwy alwyVar = this.b;
        alwy alwyVar2 = alwy.a;
        defpackage.alat alatVar = alwyVar.c;
        if (!alatVar.c()) {
            alwyVar.c = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, alwyVar.c);
    }

    public final void aW(java.lang.String str, java.lang.String str2) {
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(str2);
        u();
        alxu alxuVar = this.b;
        alxu alxuVar2 = alxu.a;
        defpackage.albe albeVar = alxuVar.j;
        if (!albeVar.b) {
            alxuVar.j = albeVar.a();
        }
        alxuVar.j.put(str, str2);
    }

    public final void aX(java.util.Map map) {
        u();
        alxr alxrVar = this.b;
        alxr alxrVar2 = alxr.a;
        new alas(alxrVar.b(), alxr.i).putAll(map);
    }

    public final void aY(java.lang.String str) {
        u();
        alxq alxqVar = this.b;
        alxq alxqVar2 = alxq.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = alxqVar.b;
        if (!alatVar.c()) {
            alxqVar.b = defpackage.alad.J(alatVar);
        }
        alxqVar.b.add(str);
    }

    public final void aZ(java.lang.Iterable iterable) {
        u();
        alyg alygVar = this.b;
        alyg alygVar2 = alyg.a;
        alygVar.b();
        defpackage.akyl.i(iterable, alygVar.c);
    }

    public final void aa(java.lang.Iterable iterable) {
        u();
        vts vtsVar = this.b;
        vts vtsVar2 = vts.a;
        defpackage.alat alatVar = vtsVar.e;
        if (!alatVar.c()) {
            vtsVar.e = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, vtsVar.e);
    }

    public final void ab(java.lang.Iterable iterable) {
        u();
        vts vtsVar = this.b;
        vts vtsVar2 = vts.a;
        defpackage.alat alatVar = vtsVar.c;
        if (!alatVar.c()) {
            vtsVar.c = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, vtsVar.c);
    }

    public final void ac(java.lang.Iterable iterable) {
        u();
        vtu vtuVar = this.b;
        vtu vtuVar2 = vtu.a;
        defpackage.alat alatVar = vtuVar.e;
        if (!alatVar.c()) {
            vtuVar.e = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, vtuVar.e);
    }

    public final void ad(java.lang.Iterable iterable) {
        u();
        defpackage.vzj vzjVar = (defpackage.vzj) this.b;
        defpackage.vzj vzjVar2 = defpackage.vzj.a;
        vzjVar.b();
        defpackage.akyl.i(iterable, vzjVar.c);
    }

    public final void ae(defpackage.vzi vziVar) {
        u();
        defpackage.vzj vzjVar = (defpackage.vzj) this.b;
        defpackage.vzj vzjVar2 = defpackage.vzj.a;
        j$.util.Objects.requireNonNull(vziVar);
        vzjVar.b();
        vzjVar.c.add(vziVar);
    }

    public final void af(java.lang.String str, boolean z) {
        j$.util.Objects.requireNonNull(str);
        u();
        zsf zsfVar = this.b;
        zsf zsfVar2 = zsf.a;
        defpackage.albe albeVar = zsfVar.l;
        if (!albeVar.b) {
            zsfVar.l = albeVar.a();
        }
        zsfVar.l.put(str, java.lang.Boolean.valueOf(z));
    }

    public final void ag(java.util.Map map) {
        u();
        abtq abtqVar = this.b;
        abtq abtqVar2 = abtq.a;
        defpackage.albe albeVar = abtqVar.b;
        if (!albeVar.b) {
            abtqVar.b = albeVar.a();
        }
        abtqVar.b.putAll(map);
    }

    public final void ah(defpackage.acuw acuwVar) {
        u();
        defpackage.acux acuxVar = (defpackage.acux) this.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        j$.util.Objects.requireNonNull(acuwVar);
        acuxVar.b();
        acuxVar.h.add(acuwVar);
    }

    public final void ai(java.lang.Iterable iterable) {
        u();
        acvu acvuVar = this.b;
        acvu acvuVar2 = acvu.a;
        defpackage.alat alatVar = acvuVar.o;
        if (!alatVar.c()) {
            acvuVar.o = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, acvuVar.o);
    }

    public final void aj(java.lang.String str, acvu acvuVar) {
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(acvuVar);
        u();
        defpackage.acvz acvzVar = (defpackage.acvz) this.b;
        defpackage.acvz acvzVar2 = defpackage.acvz.a;
        acvzVar.b().put(str, acvuVar);
    }

    public final void ak(java.lang.String str) {
        j$.util.Objects.requireNonNull(str);
        u();
        defpackage.acvz acvzVar = (defpackage.acvz) this.b;
        defpackage.acvz acvzVar2 = defpackage.acvz.a;
        acvzVar.b().remove(str);
    }

    public final void al(java.lang.String str, acwg acwgVar) {
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(acwgVar);
        u();
        defpackage.acwh acwhVar = (defpackage.acwh) this.b;
        defpackage.acwh acwhVar2 = defpackage.acwh.a;
        acwhVar.b().put(str, acwgVar);
    }

    public final void am(java.lang.String str) {
        j$.util.Objects.requireNonNull(str);
        u();
        defpackage.acwh acwhVar = (defpackage.acwh) this.b;
        defpackage.acwh acwhVar2 = defpackage.acwh.a;
        acwhVar.b().remove(str);
    }

    public final void an(java.lang.String str) {
        u();
        aevy aevyVar = this.b;
        aevy aevyVar2 = aevy.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = aevyVar.i;
        if (!alatVar.c()) {
            aevyVar.i = defpackage.alad.J(alatVar);
        }
        aevyVar.i.add(str);
    }

    public final void ao(java.lang.String str) {
        u();
        aeya aeyaVar = this.b;
        aeya aeyaVar2 = aeya.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = aeyaVar.c;
        if (!alatVar.c()) {
            aeyaVar.c = defpackage.alad.J(alatVar);
        }
        aeyaVar.c.add(str);
    }

    public final void ap(java.lang.String str, aeya aeyaVar) {
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(aeyaVar);
        u();
        aeyb aeybVar = this.b;
        aeyb aeybVar2 = aeyb.a;
        defpackage.albe albeVar = aeybVar.b;
        if (!albeVar.b) {
            aeybVar.b = albeVar.a();
        }
        aeybVar.b.put(str, aeyaVar);
    }

    public final void aq(int i, defpackage.agqm agqmVar) {
        j$.util.Objects.requireNonNull(agqmVar);
        u();
        defpackage.agqk agqkVar = (defpackage.agqk) this.b;
        defpackage.agqk agqkVar2 = defpackage.agqk.a;
        agqkVar.b().put(java.lang.Integer.valueOf(i), agqmVar);
    }

    public final void ar(defpackage.ahmo ahmoVar) {
        u();
        defpackage.ahmp ahmpVar = (defpackage.ahmp) this.b;
        defpackage.ahmp ahmpVar2 = defpackage.ahmp.a;
        j$.util.Objects.requireNonNull(ahmoVar);
        defpackage.alat alatVar = ahmpVar.d;
        if (!alatVar.c()) {
            ahmpVar.d = defpackage.alad.J(alatVar);
        }
        ahmpVar.d.add(ahmoVar);
    }

    public final void as(defpackage.ahop ahopVar) {
        u();
        defpackage.ahqy ahqyVar = (defpackage.ahqy) this.b;
        defpackage.ahqy ahqyVar2 = defpackage.ahqy.a;
        j$.util.Objects.requireNonNull(ahopVar);
        defpackage.alat alatVar = ahqyVar.e;
        if (!alatVar.c()) {
            ahqyVar.e = defpackage.alad.J(alatVar);
        }
        ahqyVar.e.add(ahopVar);
    }

    public final void at(ahwg ahwgVar) {
        u();
        ahwh ahwhVar = this.b;
        ahwh ahwhVar2 = ahwh.a;
        j$.util.Objects.requireNonNull(ahwgVar);
        defpackage.alat alatVar = ahwhVar.c;
        if (!alatVar.c()) {
            ahwhVar.c = defpackage.alad.J(alatVar);
        }
        ahwhVar.c.add(ahwgVar);
    }

    public final void au(aivj aivjVar) {
        u();
        aivk aivkVar = this.b;
        aivk aivkVar2 = aivk.a;
        j$.util.Objects.requireNonNull(aivjVar);
        aivkVar.b();
        aivkVar.b.add(aivjVar);
    }

    public final void av(akjc akjcVar) {
        u();
        akjh akjhVar = this.b;
        akjh akjhVar2 = akjh.a;
        j$.util.Objects.requireNonNull(akjcVar);
        akjhVar.b();
        akjhVar.g.add(akjcVar);
    }

    public final void aw(java.lang.Iterable iterable) {
        u();
        akkn akknVar = this.b;
        akkn akknVar2 = akkn.a;
        defpackage.alak alakVar = akknVar.c;
        if (!alakVar.c()) {
            akknVar.c = defpackage.alad.H(alakVar);
        }
        defpackage.akyl.i(iterable, akknVar.c);
    }

    public final void ax(int i, defpackage.akzx akzxVar) {
        u();
        defpackage.vpk vpkVar = (defpackage.vpk) this.b;
        vpj vpjVarR = akzxVar.r();
        defpackage.vpk vpkVar2 = defpackage.vpk.a;
        j$.util.Objects.requireNonNull(vpjVarR);
        vpkVar.b();
        vpkVar.b.set(i, vpjVarR);
    }

    public final void ay(defpackage.akzx akzxVar) {
        u();
        defpackage.vzj vzjVar = (defpackage.vzj) this.b;
        defpackage.vzi vziVar = (defpackage.vzi) akzxVar.r();
        defpackage.vzj vzjVar2 = defpackage.vzj.a;
        j$.util.Objects.requireNonNull(vziVar);
        vzjVar.b();
        vzjVar.c.add(vziVar);
    }

    public final void az(defpackage.akzx akzxVar) {
        u();
        wxh wxhVar = this.b;
        wxg wxgVarR = akzxVar.r();
        wxh wxhVar2 = wxh.a;
        j$.util.Objects.requireNonNull(wxgVarR);
        defpackage.alat alatVar = wxhVar.d;
        if (!alatVar.c()) {
            wxhVar.d = defpackage.alad.J(alatVar);
        }
        wxhVar.d.add(wxgVarR);
    }

    public final spe b() {
        spe speVar = this.b.c;
        return speVar == null ? spe.a : speVar;
    }

    public final void bA(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.Y();
        defpackage.akyl.i(iterable, aperVar.h);
    }

    public final void bB(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.Z();
        defpackage.akyl.i(iterable, aperVar.i);
    }

    public final void bC(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.aa();
        defpackage.akyl.i(iterable, aperVar.j);
    }

    public final void bD(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.b();
        aperVar.m.set(i, apeqVar);
    }

    public final void bE(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.c();
        aperVar.o.set(i, apeqVar);
    }

    public final void bF(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.d();
        aperVar.l.set(i, apeqVar);
    }

    public final void bG(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.X();
        aperVar.k.set(i, apeqVar);
    }

    public final void bH(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.Y();
        aperVar.h.set(i, apeqVar);
    }

    public final void bI(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.Z();
        aperVar.i.set(i, apeqVar);
    }

    public final void bJ(int i, defpackage.apeq apeqVar) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        j$.util.Objects.requireNonNull(apeqVar);
        aperVar.aa();
        aperVar.j.set(i, apeqVar);
    }

    public final void bK(defpackage.akzx akzxVar) {
        u();
        defpackage.apfr apfrVar = (defpackage.apfr) this.b;
        apfw apfwVarR = akzxVar.r();
        defpackage.apfr apfrVar2 = defpackage.apfr.a;
        j$.util.Objects.requireNonNull(apfwVarR);
        defpackage.alat alatVar = apfrVar.k;
        if (!alatVar.c()) {
            apfrVar.k = defpackage.alad.J(alatVar);
        }
        apfrVar.k.add(apfwVarR);
    }

    public final void bL(int i) {
        u();
        apgq apgqVar = this.b;
        apgq apgqVar2 = apgq.a;
        defpackage.alak alakVar = apgqVar.c;
        if (!alakVar.c()) {
            apgqVar.c = defpackage.alad.H(alakVar);
        }
        apgqVar.c.g(i);
    }

    public final void bM(int i) {
        u();
        apgq apgqVar = this.b;
        apgq apgqVar2 = apgq.a;
        defpackage.alak alakVar = apgqVar.b;
        if (!alakVar.c()) {
            apgqVar.b = defpackage.alad.H(alakVar);
        }
        apgqVar.b.g(i);
    }

    public final void bN(float f) {
        u();
        aqag aqagVar = this.b;
        aqag aqagVar2 = aqag.a;
        defpackage.alaj alajVar = aqagVar.e;
        if (!alajVar.c()) {
            aqagVar.e = defpackage.alad.G(alajVar);
        }
        aqagVar.e.g(f);
    }

    public final void bO(int i) {
        u();
        aqag aqagVar = this.b;
        aqag aqagVar2 = aqag.a;
        defpackage.alak alakVar = aqagVar.f;
        if (!alakVar.c()) {
            aqagVar.f = defpackage.alad.H(alakVar);
        }
        aqagVar.f.g(i);
    }

    public final void bP(defpackage.akzx akzxVar) {
        u();
        aqai aqaiVar = this.b;
        aqah aqahVarR = akzxVar.r();
        aqai aqaiVar2 = aqai.a;
        j$.util.Objects.requireNonNull(aqahVarR);
        aqaiVar.b();
        aqaiVar.b.add(aqahVarR);
    }

    public final void bQ(defpackage.akzx akzxVar) {
        u();
        alyk alykVar = this.b;
        alyj alyjVarR = akzxVar.r();
        alyk alykVar2 = alyk.a;
        j$.util.Objects.requireNonNull(alyjVarR);
        defpackage.alat alatVar = alykVar.d;
        if (!alatVar.c()) {
            alykVar.d = defpackage.alad.J(alatVar);
        }
        alykVar.d.add(alyjVarR);
    }

    public final void ba(java.lang.Iterable iterable) {
        u();
        alyj alyjVar = this.b;
        alyj alyjVar2 = alyj.a;
        defpackage.alat alatVar = alyjVar.d;
        if (!alatVar.c()) {
            alyjVar.d = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, alyjVar.d);
    }

    public final void bb(defpackage.akzx akzxVar) {
        u();
        amav amavVar = this.b;
        amau amauVarR = akzxVar.r();
        amav amavVar2 = amav.a;
        j$.util.Objects.requireNonNull(amauVarR);
        defpackage.alat alatVar = amavVar.b;
        if (!alatVar.c()) {
            amavVar.b = defpackage.alad.J(alatVar);
        }
        amavVar.b.add(amauVarR);
    }

    public final void bc(java.lang.Iterable iterable) {
        u();
        amaz amazVar = this.b;
        amaz amazVar2 = amaz.a;
        defpackage.alat alatVar = amazVar.c;
        if (!alatVar.c()) {
            amazVar.c = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(iterable, amazVar.c);
    }

    public final void bd(java.lang.Iterable iterable) {
        u();
        amfy amfyVar = this.b;
        amfy amfyVar2 = amfy.a;
        amfyVar.b();
        defpackage.akyl.i(iterable, amfyVar.d);
    }

    public final void be(amfx amfxVar) {
        u();
        amfy amfyVar = this.b;
        amfy amfyVar2 = amfy.a;
        j$.util.Objects.requireNonNull(amfxVar);
        amfyVar.b();
        amfyVar.d.add(amfxVar);
    }

    public final void bf(java.lang.String str) {
        u();
        amhl amhlVar = this.b;
        amhl amhlVar2 = amhl.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = amhlVar.f;
        if (!alatVar.c()) {
            amhlVar.f = defpackage.alad.J(alatVar);
        }
        amhlVar.f.add(str);
    }

    public final void bg(amie amieVar) {
        u();
        amib amibVar = this.b;
        amib amibVar2 = amib.a;
        j$.util.Objects.requireNonNull(amieVar);
        defpackage.alat alatVar = amibVar.b;
        if (!alatVar.c()) {
            amibVar.b = defpackage.alad.J(alatVar);
        }
        amibVar.b.add(amieVar);
    }

    public final void bh(amnz amnzVar) {
        u();
        amoc amocVar = this.b;
        amoc amocVar2 = amoc.a;
        j$.util.Objects.requireNonNull(amnzVar);
        defpackage.alat alatVar = amocVar.c;
        if (!alatVar.c()) {
            amocVar.c = defpackage.alad.J(alatVar);
        }
        amocVar.c.add(amnzVar);
    }

    public final void bi(amsp amspVar) {
        u();
        defpackage.amsq amsqVar = (defpackage.amsq) this.b;
        defpackage.amsq amsqVar2 = defpackage.amsq.a;
        j$.util.Objects.requireNonNull(amspVar);
        defpackage.alat alatVar = amsqVar.j;
        if (!alatVar.c()) {
            amsqVar.j = defpackage.alad.J(alatVar);
        }
        amsqVar.j.add(amspVar);
    }

    public final apee bj(int i) {
        return (apee) ((defpackage.apef) this.b).q.get(i);
    }

    public final void bk(int i, defpackage.akzx akzxVar) {
        u();
        defpackage.apef apefVar = (defpackage.apef) this.b;
        apee apeeVarR = akzxVar.r();
        defpackage.apef apefVar2 = defpackage.apef.a;
        j$.util.Objects.requireNonNull(apeeVarR);
        apefVar.b();
        apefVar.q.set(i, apeeVarR);
    }

    public final void bl(java.lang.Iterable iterable) {
        u();
        defpackage.apem apemVar = (defpackage.apem) this.b;
        defpackage.apem apemVar2 = defpackage.apem.a;
        defpackage.alat alatVar = apemVar.c;
        if (!alatVar.c()) {
            apemVar.c = alatVar.d(alatVar.size() << 1);
        }
        defpackage.akyl.i(iterable, apemVar.c);
    }

    public final void bm(java.lang.Iterable iterable) {
        u();
        defpackage.apem apemVar = (defpackage.apem) this.b;
        defpackage.apem apemVar2 = defpackage.apem.a;
        defpackage.alat alatVar = apemVar.d;
        if (!alatVar.c()) {
            apemVar.d = alatVar.d(alatVar.size() << 1);
        }
        defpackage.akyl.i(iterable, apemVar.d);
    }

    public final defpackage.apeq bn(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).m.get(i);
    }

    public final defpackage.apeq bo(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).o.get(i);
    }

    public final defpackage.apeq bp(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).l.get(i);
    }

    public final defpackage.apeq bq(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).k.get(i);
    }

    public final defpackage.apeq br(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).h.get(i);
    }

    public final defpackage.apeq bs(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).i.get(i);
    }

    public final defpackage.apeq bt(int i) {
        return (defpackage.apeq) ((defpackage.aper) this.b).j.get(i);
    }

    public final void bu(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.b();
        defpackage.akyl.i(iterable, aperVar.m);
    }

    public final void bv(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.c();
        defpackage.akyl.i(iterable, aperVar.o);
    }

    public final void bw(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        defpackage.alat alatVar = aperVar.r;
        if (!alatVar.c()) {
            aperVar.r = alatVar.d(alatVar.size() << 1);
        }
        defpackage.akyl.i(iterable, aperVar.r);
    }

    public final void bx(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        defpackage.alat alatVar = aperVar.q;
        if (!alatVar.c()) {
            aperVar.q = alatVar.d(alatVar.size() << 1);
        }
        defpackage.akyl.i(iterable, aperVar.q);
    }

    public final void by(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.d();
        defpackage.akyl.i(iterable, aperVar.l);
    }

    public final void bz(java.lang.Iterable iterable) {
        u();
        defpackage.aper aperVar = (defpackage.aper) this.b;
        defpackage.aper aperVar2 = defpackage.aper.a;
        aperVar.X();
        defpackage.akyl.i(iterable, aperVar.k);
    }

    public final boolean c() {
        return (this.b.b & 1) != 0;
    }

    @Override // defpackage.akyl
    /* JADX INFO: renamed from: d */
    protected final /* synthetic */ defpackage.akyl f(defpackage.akym akymVar) {
        z((defpackage.alad) akymVar);
        return this;
    }

    @Override // defpackage.akyl
    public final /* bridge */ /* synthetic */ defpackage.akyl l(byte[] bArr, int i) throws defpackage.alaz {
        A(bArr, i, defpackage.akzq.a);
        return this;
    }

    @Override // defpackage.akyl
    public final /* bridge */ /* synthetic */ defpackage.akyl m(byte[] bArr, int i, defpackage.akzq akzqVar) throws defpackage.alaz {
        A(bArr, i, akzqVar);
        return this;
    }

    @Override // defpackage.akyl
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.akzx clone() {
        defpackage.akzx akzxVarK = this.a.K();
        akzxVarK.b = s();
        return akzxVarK;
    }

    @Override // defpackage.albg
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final defpackage.alad r() {
        defpackage.alad aladVarS = s();
        if (defpackage.alad.T(aladVarS, true)) {
            return aladVarS;
        }
        throw new defpackage.alch();
    }

    @Override // defpackage.albg
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public defpackage.alad s() {
        boolean zU = this.b.U();
        defpackage.alad aladVar = this.b;
        if (!zU) {
            return aladVar;
        }
        aladVar.O();
        return this.b;
    }

    @Override // defpackage.albi
    public final /* bridge */ /* synthetic */ defpackage.albh t() {
        throw null;
    }

    public final void u() {
        if (this.b.U()) {
            return;
        }
        v();
    }

    protected void v() {
        defpackage.alad aladVarBR = bR();
        defpackage.albp.a.a(aladVarBR).h(aladVarBR, this.b);
        this.b = aladVarBR;
    }

    @Override // defpackage.albi
    public final boolean w() {
        return defpackage.alad.T(this.b, false);
    }

    public final void x() {
        if (this.a.U()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = bR();
    }

    @Override // defpackage.akyl, defpackage.albg
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void k(defpackage.akzf akzfVar, defpackage.akzq akzqVar) throws java.io.IOException {
        u();
        try {
            defpackage.albw albwVarA = defpackage.albp.a.a(this.b);
            defpackage.alad aladVar = this.b;
            java.lang.Object akzgVar = akzfVar.h;
            if (akzgVar == null) {
                akzgVar = new defpackage.akzg(akzfVar);
            }
            albwVarA.i(aladVar, (defpackage.akzg) akzgVar, akzqVar);
        } catch (java.lang.RuntimeException e) {
            if (!(e.getCause() instanceof java.io.IOException)) {
                throw e;
            }
            throw ((java.io.IOException) e.getCause());
        }
    }

    public final void z(defpackage.alad aladVar) {
        if (aladVar != null && !this.a.getClass().isInstance(aladVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (this.a.equals(aladVar)) {
            return;
        }
        u();
        defpackage.alad aladVar2 = this.b;
        defpackage.albp.a.a(aladVar2).h(aladVar2, aladVar);
    }

    public akzx(float[] fArr, byte[] bArr) {
        this(defpackage.amsq.a);
    }

    public akzx(char[][] cArr, byte[] bArr) {
        this((defpackage.alad) amoc.a);
    }

    public akzx(short[][] sArr) {
        this((defpackage.alad) akld.a);
    }

    public akzx(boolean[][] zArr, byte[] bArr) {
        this(defpackage.apef.a);
    }

    public akzx(float[] fArr, char[] cArr) {
        this(defpackage.akrj.a);
    }

    public akzx(short[] sArr, byte[] bArr) {
        this(defpackage.apem.a);
    }

    public akzx(int[] iArr, byte[] bArr) {
        this(defpackage.aktb.a);
    }

    public akzx(char[][][] cArr, byte[] bArr) {
        this(defpackage.aper.a);
    }

    public akzx() {
        throw null;
    }

    public akzx(boolean[][][] zArr, byte[] bArr) {
        this(defpackage.apfd.a);
    }

    public akzx(short[][] sArr, char[] cArr) {
        this(defpackage.apfr.a);
    }

    public akzx(boolean[] zArr, char[] cArr) {
        this(defpackage.apgp.a);
    }

    public akzx(float[][] fArr, char[] cArr) {
        this((defpackage.alad) apgq.a);
    }

    public akzx(short[][] sArr, byte[] bArr) {
        this((defpackage.alad) alfr.a);
    }

    public akzx(byte[] bArr, byte[] bArr2) {
        this((defpackage.alad) algv.a);
    }

    public akzx(char[] cArr, char[] cArr2) {
        this((defpackage.alad) aqag.a);
    }

    public akzx(char[] cArr) {
        this((defpackage.alad) aqai.a);
    }

    public akzx(float[][] fArr, byte[] bArr) {
        this((defpackage.alad) almg.a);
    }

    public akzx(short[][][] sArr, byte[] bArr) {
        this((defpackage.alad) alnw.a);
    }

    public akzx(byte[][] bArr, char[] cArr) {
        this((defpackage.alad) alob.a);
    }

    public akzx(short[] sArr, char[] cArr) {
        this((defpackage.alad) alol.a);
    }

    public akzx(int[][] iArr, char[] cArr) {
        this((defpackage.alad) alon.a);
    }

    public akzx(float[][][] fArr, byte[] bArr) {
        this((defpackage.alad) alqm.a);
    }

    public akzx(byte[] bArr) {
        this((defpackage.alad) alqp.a);
    }

    public akzx(int[] iArr) {
        this((defpackage.alad) alqr.a);
    }

    public akzx(boolean[][] zArr) {
        this((defpackage.alad) alrc.a);
    }

    public akzx(char[][] cArr) {
        this((defpackage.alad) alri.a);
    }

    public akzx(byte[][][] bArr) {
        this((defpackage.alad) alsl.a);
    }

    public akzx(float[] fArr) {
        this((defpackage.alad) alvj.a);
    }

    public akzx(short[][][] sArr) {
        this((defpackage.alad) alvz.a);
    }

    public akzx(boolean[][][] zArr) {
        this((defpackage.alad) alwf.a);
    }

    public akzx(byte[][] bArr, byte[] bArr2) {
        this((defpackage.alad) alwg.a);
    }

    public akzx(boolean[] zArr, byte[] bArr) {
        this((defpackage.alad) alwn.a);
    }

    public akzx(int[][] iArr, byte[] bArr) {
        this((defpackage.alad) alwy.a);
    }

    public akzx(char[] cArr, byte[] bArr) {
        this((defpackage.alad) alxe.a);
    }

    public akzx(byte[][][] bArr, byte[] bArr2) {
        this((defpackage.alad) alxu.a);
    }

    public akzx(int[][][] iArr, byte[] bArr) {
        this((defpackage.alad) alxr.a);
    }

    public akzx(char[][] cArr, char[] cArr2) {
        this((defpackage.alad) alxq.a);
    }

    public akzx(int[] iArr, char[] cArr) {
        this((defpackage.alad) alyf.a);
    }

    public akzx(boolean[][] zArr, char[] cArr) {
        this((defpackage.alad) alyg.a);
    }

    public akzx(byte[] bArr, char[] cArr) {
        this((defpackage.alad) alyk.a);
    }

    public akzx(short[] sArr) {
        this((defpackage.alad) alyj.a);
    }

    public akzx(boolean[] zArr) {
        this((defpackage.alad) amav.a);
    }

    public akzx(float[][] fArr) {
        this((defpackage.alad) amaz.a);
    }

    public akzx(int[][] iArr) {
        this((defpackage.alad) amfy.a);
    }

    public akzx(char[][][] cArr) {
        this((defpackage.alad) amhl.a);
    }

    public akzx(byte[][] bArr) {
        this((defpackage.alad) amib.a);
    }

    public akzx(int[][][] iArr) {
        this((defpackage.alad) amjn.a);
    }

    public akzx(float[][][] fArr) {
        this((defpackage.alad) amjp.a);
    }
}
