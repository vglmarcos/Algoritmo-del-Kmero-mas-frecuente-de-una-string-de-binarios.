use List::MoreUtils qw(uniq);

sub kmero {
	print "\nIngrese su cadena de binarios, limite 20: ";
	my $string = <STDIN>;
	my $n = length($string);
	my $k=1;
	my @string = split("", $string);
	my @array;
	my $m = $k;
	my @array2;

	my $d=0;

	while ($d<$n-1) {

		for (my $i = 0; $i < $n - $m; $i++) {
			push @array, substr $string, $i, $i+$k;	
			$k = $k-1;
		}

		print "\n";

		#@array2 = uniq(@array);

		my $n2 = scalar @array2;

		$k=$m;

		print "Cuando k es ", $k;

		print "\n\n";

		contar_elementos(@array);

		$d = $d + 1;
		$m = $m + 1;
		$k=$m;

		@array=();
		@array2=();
		<STDIN>


	}

	print "\nEl kmero mayor fue $kmero con la frecuencia $mayor, cuando K tomo el valor de $k2. \n";
	#10110010110001001110
}

sub contar_elementos {
	my(@array) = @_;
	# con un hash contamos cuÃ¡ntas veces aparece cada cadena:
	$k=$k+1;
	my %count;
	$count{$_}++ for @array;
	# y luego buscamos en el hash la entrada que tiene la cuenta mÃ¡s alta:
	for (keys %count) {
		$f = $count{$_}*$k;
  		print "$_ veces repetidas: $count{$_} x K:$k = ", $f, "\n";
  		$kmero;
  		$mayor;
  		if ($f>$mayor) {
  			$mayor = $f;
  			$kmero = $_;
  			$k2=$k;
  		}
	}
}

kmero();
