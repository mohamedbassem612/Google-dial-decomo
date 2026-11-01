package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vpm implements java.util.function.Function {
    public final /* synthetic */ vpq a;
    public final /* synthetic */ android.telecom.PhoneAccountHandle b;
    public final /* synthetic */ defpackage.vps c;

    public /* synthetic */ vpm(vpq vpqVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vps vpsVar) {
        this.a = vpqVar;
        this.b = phoneAccountHandle;
        this.c = vpsVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.b;
        vpk vpkVar = (vpk) obj;
        defpackage.vpj vpjVarA = vpq.a(phoneAccountHandle, vpkVar);
        akzx akzxVarP = vpq.a(phoneAccountHandle, vpkVar).p();
        defpackage.vps vpsVar = this.c;
        int i = vpsVar.e.a;
        defpackage.vpi vpiVar = ((defpackage.vpj) akzxVarP.b).f;
        if (vpiVar == null) {
            vpiVar = defpackage.vpi.a;
        }
        defpackage.absu absuVar = vpsVar.f;
        vpq vpqVar = this.a;
        java.lang.String str = vpiVar.d;
        int i2 = absuVar.a;
        j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableList(((defpackage.vpj) akzxVarP.b).g)).filter(new vpl(vpsVar, 4)).forEach(new defpackage.uwm(5));
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableList(((defpackage.vpj) akzxVarP.b).g)).filter(new defpackage.ree(vpsVar, 20));
        j$.util.stream.Collector collector = aido.a;
        aify aifyVar = (aify) streamFilter.collect(collector);
        java.lang.String string = vpqVar.b.getResources().getString(2132018220, 0);
        java.lang.String strTrim = string.substring(0, string.length() - 1).trim();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVar).filter(new vpl(strTrim, 1)).map(new thy(strTrim, 18));
        j$.util.stream.Collector collector2 = aido.b;
        aify aifyVar2 = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aifyVar), j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(vpsVar.b).map(new defpackage.pgq(vpqVar, new defpackage.vpp((aihd) map.collect(collector2)), 15)).collect(collector))).map(new thy(vpsVar, 19)).collect(collector);
        akzxVarP.u();
        ((defpackage.vpj) akzxVarP.b).g = albq.a;
        akzxVarP.u();
        defpackage.vpj vpjVar = (defpackage.vpj) akzxVarP.b;
        vpjVar.b();
        akyl.i(aifyVar2, vpjVar.g);
        defpackage.vpj vpjVar2 = (defpackage.vpj) akzxVarP.p();
        java.lang.String str2 = vpjVar2.e;
        if (!str2.isEmpty()) {
            defpackage.vpi vpiVar2 = vpjVar2.f;
            if (vpiVar2 == null) {
                vpiVar2 = defpackage.vpi.a;
            }
            if (!vpiVar2.c.equals(str2) && !((aihd) j$.util.Collection.-EL.stream(vpjVar2.g).map(new defpackage.vga(19)).collect(collector2)).contains(str2)) {
                throw new java.lang.IllegalArgumentException("activated greeting id must be one of the voicemail greeting entries");
            }
        }
        aihb aihbVar = new aihb();
        defpackage.vpi vpiVar3 = vpjVar2.f;
        if (vpiVar3 == null) {
            vpiVar3 = defpackage.vpi.a;
        }
        if (!vpiVar3.c.isEmpty()) {
            defpackage.vpi vpiVar4 = vpjVar2.f;
            if (vpiVar4 == null) {
                vpiVar4 = defpackage.vpi.a;
            }
            aihbVar.i(vpiVar4.c);
        }
        aihbVar.k((java.lang.Iterable) j$.util.Collection.-EL.stream(vpjVar2.g).map(new defpackage.vga(19)).collect(collector2));
        defpackage.vpi vpiVar5 = vpjVar2.f;
        if (vpiVar5 == null) {
            vpiVar5 = defpackage.vpi.a;
        }
        if (aihbVar.h().size() != (!vpiVar5.c.isEmpty() ? 1 : 0) + vpjVar2.g.size()) {
            throw new java.lang.IllegalArgumentException("each greeting must have unique ID");
        }
        akzx akzxVarP2 = vpkVar.p();
        int iIndexOf = vpkVar.b.indexOf(vpjVarA);
        akzxVarP2.u();
        vpk vpkVar2 = akzxVarP2.b;
        j$.util.Objects.requireNonNull(vpjVar2);
        vpkVar2.b();
        vpkVar2.b.set(iIndexOf, vpjVar2);
        return akzxVarP2.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
